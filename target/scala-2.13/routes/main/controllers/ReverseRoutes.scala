// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers {

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def callApi: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "call-api")
    }
  
    // @LINE:12
    def getPosts: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "posts")
    }
  
    // @LINE:16
    def getInfo(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getInfo2")
    }
  
    // @LINE:15
    def getUserFormInformation(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getInfo")
    }
  
    // @LINE:9
    def index: Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def at(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
