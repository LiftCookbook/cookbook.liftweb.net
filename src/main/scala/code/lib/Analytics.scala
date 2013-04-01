package code.lib

import net.liftweb.http.{S, Req, LiftSession}

object Analytics {

  def addTracking(s: LiftSession, r: Req) : Unit = {
    S putInHead <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    S putAtEndOfBody <script src="/analytics.js" type="text/javascript"/>
  }

}
