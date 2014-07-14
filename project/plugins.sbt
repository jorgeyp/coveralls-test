// Plugin for scoverage
addSbtPlugin("com.sksamuel.scoverage" %% "sbt-scoverage" % "0.95.7")

// Plugin for publishing scoverage results to coveralls
addSbtPlugin("com.sksamuel.scoverage" %% "sbt-coveralls" % "0.0.5")

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:postfixOps"
)
