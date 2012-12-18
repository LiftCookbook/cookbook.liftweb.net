package bootstrap.liftweb

import net.liftweb._
import common.{Full, Empty}
import http._
import code.lib.PamfletUrl


class Boot {
  def boot {
    // where to search snippet
    LiftRules.addToPackages("code")

    // Force the request to be UTF-8
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))

    // Use HTML5 for rendering
    LiftRules.htmlProperties.default.set((r: Req) =>
      new Html5Properties(r.userAgent))


    LiftRules.earlyResponse.append {

      // The first version of the cookbook was written Pamfet.  We map the Pamflet
      // pages to the corresponding section of the current version of the cookbook:
      case PamfletUrl(name) => Full(RedirectResponse("/"+name))

      case _ => Empty

    }


    // The index page is statically generated: Lift doesn't need to touch it.
    LiftRules.liftRequest.append {
      case Req("index" :: Nil, _, _) => false
      case Req("images" ::_, _, _) => false
    }


  }
}
