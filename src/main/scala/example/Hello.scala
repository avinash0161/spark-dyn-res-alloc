package example

// import required spark classes
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkContext

// define main method (Spark entry point)
object Hello {

  def main(args: Array[String]) = {
    // Activate speculative task
    val conf = new SparkConf().setAppName("Spark dynamic allocation demo")
      .set("spark.dynamicAllocation.enabled", "true")
      .set("spark.shuffle.service.enabled", "true")
      .set("spark.dynamicAllocation.initialExecutors", "1")
      .set("spark.dynamicAllocation.executorIdleTimeout", "120s")
      .set("spark.dynamicAllocation.schedulerBacklogTimeout", "1s")
      .set("spark.executor.cores", "1")
      .set("spark.executor.memory", "512m")

    val sparkContext = new SparkContext(conf)

    println("Starting processing")
    sparkContext.parallelize(0 to 5, 5)
      .foreach(item => {
        // for each number wait 3 seconds
        Thread.sleep(10000)
      })
    println("Terminating processing")
  }
}