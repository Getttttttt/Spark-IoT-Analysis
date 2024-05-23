/*** SimpleApp.java ***/
import org.apache.spark.api.java.*;
import org.apache.spark.SparkConf;

public class CountLines {
    public static void main(String[] args) {
        // 指定文件位于 HDFS 上的路径
        String hdfsFile = "hdfs://localhost:9000/user/spark/export.csv"; 

        // 配置 Spark
        SparkConf conf = new SparkConf().setMaster("local").setAppName("File Line Counter");

        // 初始化 JavaSparkContext
        JavaSparkContext sc = new JavaSparkContext(conf);

        // 从 HDFS 读取文件，创建一个 JavaRDD
        JavaRDD<String> fileData = sc.textFile(hdfsFile);

        // 计算文件的行数
        long lineCount = fileData.count();

        // 输出行数
        System.out.println("Total number of lines in the file: " + lineCount);

        // 关闭 SparkContext
        sc.close();
    }
}
