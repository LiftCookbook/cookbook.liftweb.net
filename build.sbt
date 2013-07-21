name := "cookbook.liftweb.net"

version := "2.2.0"

organization := "net.liftweb"

scalaVersion := "2.10.2"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")


resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases"
                )

seq(webSettings :_*)

unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }


libraryDependencies ++= {
  val liftVersion = "2.5.1"
  Seq(
    "net.liftweb"       %% "lift-webkit"        % liftVersion        % "compile",
    "net.liftmodules"   %% "lift-jquery-module_2.5" % "2.4",
    "org.eclipse.jetty" % "jetty-webapp"        % "8.1.7.v20120910"  % "container,test",
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container,test" artifacts Artifact("javax.servlet", "jar", "jar"),
    "ch.qos.logback"    % "logback-classic"     % "1.0.6",
    "org.specs2"        %% "specs2"             % "1.14"           % "test"
  )
}

