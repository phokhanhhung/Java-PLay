
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

object callApi extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.PostModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(posts: List[models.PostModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main("Call Api")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
  """),format.raw/*4.3*/("""<ul>
    """),_display_(/*5.6*/if(posts.size() > 0)/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""
      """),_display_(/*6.8*/for(post <- posts) yield /*6.26*/ {_display_(Seq[Any](format.raw/*6.28*/("""
        """),format.raw/*7.9*/("""<li>"""),_display_(/*7.14*/post/*7.18*/.getId()),format.raw/*7.26*/("""</li>
      """)))}),format.raw/*8.8*/("""
    """)))}),format.raw/*9.6*/("""
  """),format.raw/*10.3*/("""</ul>
  <a class="btn btn-primary" href="/posts" role="button">Get posts</a>
""")))}),format.raw/*12.2*/("""
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
                  SOURCE: app/views/callApi.scala.html
                  HASH: 3e6484bbf5adf273cdda0e98ba1e7e4a27d6113f
                  MATRIX: 925->1|1051->32|1081->37|1105->53|1144->55|1174->59|1210->70|1238->90|1277->92|1311->101|1344->119|1383->121|1419->131|1450->136|1462->140|1490->148|1533->162|1569->169|1600->173|1710->253
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|40->9|41->10|43->12
                  -- GENERATED --
              */
          