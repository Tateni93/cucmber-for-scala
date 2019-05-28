name := "cucumber-for-scala"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "3.6.0",
  "info.cukes" % "cucumber-junit" % "1.2.5",
  "info.cukes" % "cucumber-picocontainer" % "1.2.5",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.5",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)