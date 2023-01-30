package controllers;

import play.mvc.*;

import views.html.*;
import java.util.*;
import javax.inject.Inject;
import play.data.FormFactory;
import play.data.Form;
import models.*;
import play.mvc.Http.Request;
import play.i18n.MessagesApi;

import play.libs.ws.*;
import java.util.concurrent.CompletionStage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import play.libs.Json;
import play.libs.Json.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class HomeController extends Controller implements WSBodyReadables, WSBodyWritables {

	private final WSClient ws;

	@Inject
	public HomeController(WSClient ws) {
		this.ws = ws;
	}

	public Result callApi() {
		return ok(callApi.render());
	}

	// public Result getPosts() {
		// ObjectMapper mapper = new ObjectMapper();

		
		// WSRequest request = ws.url("https://jsonplaceholder.typicode.com/posts");

		public CompletionStage<Result> getPosts() {
			ArrayList<PostModel> posts = new ArrayList<PostModel>();
			return ws.url("https://jsonplaceholder.typicode.com/posts").get()
				.thenApply(r -> {
					
					for (int i = 0; i < r.getBody(json()).size(); i++) {
						
						// map.readValue(r.getBody(json()).get(i), HashMap.class);
						
						// JsonNode json = Json.parse('"' + r.getBody(json()).get(i) + '"');
						PostModel post = Json.fromJson(r.getBody(json()).get(i), PostModel.class);
						
						posts1.add(post);
						System.out.println("hehe: \n" + posts.get(i).getId() + "\n");
						
					}
					// System.out.println("hehe: \n" + posts + "\n");
				
					return ok(posts.render(posts));
				});
		// WSResponse res = rp.toCompletableFuture().get();
		// PostModel posts = Json.fromJson(rp, PostModel.class);
		// System.out.println("data: \n" + rp);
		// System.out.println("hhhhhhhhhhhhhhhh: \n" + posts1.get(0).getId() + "\n");
		
	}


	// private final AssetsFinder assetsFinder;

	// @Inject
	// public HomeController(AssetsFinder assetsFinder) {
	// this.assetsFinder = assetsFinder;
	// }

	/**
	 * An action that renders an HTML page with a welcome message. The configuration
	 * in the <code>routes</code> file means that this method will be called when
	 * the application receives a <code>GET</code> request with a path of
	 * <code>/</code>.
	 */
	@Inject
	FormFactory formFactory;

	@Inject
	MessagesApi messagesApi;

	public Result index() {
		return ok(index.render());
	}

	// login

	public Result login(Http.Request request) {
		Form<UserModel> userForm = formFactory.form(UserModel.class);
		return ok(login.render(userForm, messagesApi.preferred(request)));
	}

	public Result getUserFormInformation(Http.Request request) {
		Form<UserModel> userForm = formFactory.form(UserModel.class).bindFromRequest(request);
		UserModel user = userForm.get();
		System.out.println(request.body());
		System.out.println("Username: " + user.getUsername());
		System.out.println("Password: " + user.getPassword() + "\n");
		return redirect(controllers.routes.HomeController.login());
	}

	public void getPost() {
		WSRequest request = ws.url("https://jsonplaceholder.typicode.com/posts");
		CompletionStage<? extends WSResponse> rp = request.get();
		System.out.println(rp);
	}

	// react
	public Result getInfo(Http.Request request) {
		Form<UserModel> userForm = formFactory.form(UserModel.class).bindFromRequest(request);
		UserModel user = userForm.get();
		System.out.println("Username: " + user.getUsername());
		System.out.println("Password: " + user.getPassword() + "\n");
		return redirect("http://localhost:3000/");
	}
}
