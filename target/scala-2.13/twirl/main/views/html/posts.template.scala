
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

object posts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.PostModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: List[models.PostModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/callApi(posts)),format.raw/*3.16*/("""
  
"""))
      }
    }
  }

  def render(posts:List[models.PostModel]): play.twirl.api.HtmlFormat.Appendable = apply(posts)

  def f:((List[models.PostModel]) => play.twirl.api.HtmlFormat.Appendable) = (posts) => apply(posts)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/posts.scala.html
                  HASH: 043ea789bc3fd35057d33555548e8587d250cc55
                  MATRIX: 923->1|1049->32|1079->37|1113->51
                  LINES: 27->1|32->1|34->3|34->3
                  -- GENERATED --
              */
          