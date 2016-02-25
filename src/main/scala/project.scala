import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.sql.SQLContext
/*
 * Written by: Jose Carlos Carrasco Jimenez
*/

object Project extends App {
	val spConfig = (new SparkConf)
							.setMaster("local")
							.setAppName("SparkSQLProject")

		val sc = new SparkContext(spConfig)
		println("Hello from Spark")

}
