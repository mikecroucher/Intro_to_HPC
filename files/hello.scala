import org.apache.spark.sql.SparkSession
// define main method (scala entry point)
object HelloWorld {
  def main(args: Array[String]): Unit = {

    // initialise spark session (running in "local" mode)
    val sparkSession = SparkSession.builder
      .master("local")
      .appName("Hello World")
       .getOrCreate()

    // do stuff
    println("Hello, world!")
    
    // terminate underlying spark context
    sparkSession.stop()
  }
}
