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

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    // private final AssetsFinder assetsFinder;

    // @Inject
    // public HomeController(AssetsFinder assetsFinder) {
    //     this.assetsFinder = assetsFinder;
    // }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    @Inject 
    FormFactory formFactory;

    @Inject
    MessagesApi messagesApi;

    public Result index() {
        return ok(index.render());
    }

    public Result login(Http.Request request) {
        Form<UserModel> userForm = formFactory.form(UserModel.class);
        return ok(login.render(userForm, messagesApi.preferred(request)));
    }

    public Result getUserFormInformation(Http.Request request) {
        Form<UserModel> userForm = formFactory.form(UserModel.class).bindFromRequest(request);
        UserModel user = userForm.get();
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword() + "\n");
        return redirect(controllers.routes.HomeController.login());
    }
}
