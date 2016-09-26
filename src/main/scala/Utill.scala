import org.apache.spark.sql.DataFrame

object Utill {

  def createTable(): Unit = {
    Configuration.config.sqlContext.sql("DROP TABLE IF EXISTS students")
    Configuration.config.sqlContext.sql("CREATE TABLE students(firstName VARCHAR(50),lastName VARCHAR(50))")
  }

  def insertRecord(): Unit = {
    Configuration.config.sqlContext.sql("INSERT INTO TABLE students  VALUES ('Rahul','Kumar'), ('abc','xyz')")
  }

  def retrieveRecord(tableName: String): DataFrame = {
    return Configuration.config.sql("select * from " + tableName)
  }

  def loadData(): DataFrame = {
    return Configuration
      .config
      .read
      .option("header", "true")
      .csv("src/main/resources/data.csv")
  }


}
