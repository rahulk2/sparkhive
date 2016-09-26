import org.apache.spark.sql.SparkSession

object Configuration {


  def config(): SparkSession = {
    return SparkSession.builder
      .master("local")
      .appName("demo")
      .enableHiveSupport()
      .getOrCreate()
  }

}
