
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[UserModel],play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[UserModel])(implicit messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.68*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Home")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""
  """),format.raw/*5.3*/("""<!-- """),_display_(/*5.9*/helper/*5.15*/.form(action = routes.HomeController.getUserFormInformation)/*5.75*/ {_display_(Seq[Any](format.raw/*5.77*/("""
    """),_display_(/*6.6*/helper/*6.12*/.inputText(userForm("username"))),format.raw/*6.44*/("""
    """),_display_(/*7.6*/helper/*7.12*/.inputPassword(userForm("password"))),format.raw/*7.48*/("""
    """),format.raw/*8.5*/("""<input type="submit" value="submit">
  """)))}),format.raw/*9.4*/(""" """),format.raw/*9.5*/("""-->

  <form class="login-form" method="post" action=""""),_display_(/*11.51*/routes/*11.57*/.HomeController.getUserFormInformation),format.raw/*11.95*/("""">
    <!-- <input type="password" name="password" />
    <input type="text" id="username" name="username"/> -->
    <h2 style="text-align: center;">Login</h2>
    <div class="mb-3 row">
      <label for="inputUsernmae" class="col-sm-2 col-form-label">Username</label>
      <div class="col-sm-10">
        <input type="username" class="form-control" id="inputUsername" name="username" placeholder="Your username...">
      </div>
    </div>
    <div class="mb-3 row">
      <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
      <div class="col-sm-10">
        <input type="password" class="form-control" id="inputPassword" name="password" placeholder="Your password...">
      </div>
    </div>
    <div class="col-12 btn-submit">
      <button class="btn btn-primary" type="submit">Submit</button>
    </div>
  </form>
""")))}))
      }
    }
  }

  def render(userForm:Form[UserModel],messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(messages)

  def f:((Form[UserModel]) => (play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (messages) => apply(userForm)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: 1eed7da89d74c5fa1cb85a20af81d2e6887e8fcd
                  MATRIX: 935->1|1074->70|1119->67|1147->87|1175->90|1195->102|1234->104|1264->108|1295->114|1309->120|1377->180|1416->182|1448->189|1462->195|1514->227|1546->234|1560->240|1616->276|1648->282|1718->323|1745->324|1829->381|1844->387|1903->425
                  LINES: 27->1|30->2|33->1|34->3|35->4|35->4|35->4|36->5|36->5|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9|40->9|42->11|42->11|42->11
                  -- GENERATED --
              */
          