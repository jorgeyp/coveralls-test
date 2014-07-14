addSbtPlugaddSbtPlugin("org.scoverage" % "sbt-scoverage" % "0.99.5")

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:postfixOps"
)
