resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.bintrayRepo("slamdata-inc", "maven-public")

addSbtPlugin("com.eed3si9n"    % "sbt-assembly"  % "0.14.5")
addSbtPlugin("com.eed3si9n"    % "sbt-buildinfo" % "0.7.0")
addSbtPlugin("io.get-coursier" % "sbt-coursier"  % "1.1.0-M4")
addSbtPlugin("com.slamdata"    % "sbt-slamdata"  % "2.2.2")
