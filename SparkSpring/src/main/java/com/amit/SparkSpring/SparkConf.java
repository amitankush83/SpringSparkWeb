package com.amit.SparkSpring;

import org.apache.spark.sql.SparkSession;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
@Service
public class SparkConf {
	
	@Bean
	public SparkSession getSparkSession() {
	   return SparkSession.builder()
	            .appName("Spring-Saprk")
	            .master("local[*]")
	            .config("spark.sql.tungsten.enabled", "true")
	            .config("spark.io.compression.codec", "snappy")
	            .config("spark.rdd.compress", "true")
	            .getOrCreate();
	}

}
