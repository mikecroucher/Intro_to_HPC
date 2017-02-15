name := "hello" 
version := "1.0"
scalaVersion := "2.11.8"
libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "2.0.1",
    "org.apache.spark" %% "spark-sql" % "2.0.1"
)
// Could add other dependencies here e.g.
// libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.0.1"
