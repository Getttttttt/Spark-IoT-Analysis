# Spark-IoT-Analysis
This repository contains the implementation of a Spark application designed to analyze IoT data samples. It includes code for loading data into HDFS, analyzing it using Spark Shell and Java, and instructions on setting up Spark, compiling, and running the application with Maven and spark-submit.

## 任务说明

在本地机器上安装和部署Spark，利用Spark Shell和Java编写程序，对IOT设备收集的样本数据进行数据统计分析。首先，使用Hadoop Shell命令将数据加载至本地HDFS，然后在Spark平台上进行操作。使用Spark Shell和Java语言进行编程，统计数据文件的行数，并使用Maven编译打包Java应用程序，通过spark-submit运行程序。

## 具体代码实现

### 0 Hadoop加载数据文件

下载数据文件，并传至虚拟机：

![image-20240523111021781](assets/image-20240523111021781.png)

启动hadoop服务：

```shell
cd /usr/local/hadoop
./sbin/start-dfs.sh #启动hadoop
jps
```

![image-20240523111319448](assets/image-20240523111319448.png)

创建工作目录，并将数据文件传入工作目录中：

```shell
./bin/hdfs dfs -ls /
./bin/hdfs dfs -mkdir /user/spark
./bin/hdfs dfs -put /home/hadoop/Downloads/export.csv  /user/spark
```

![image-20240523112133277](assets/image-20240523112133277.png)

传输完成！

### 1 安装部署Spark
