package com.amit.SparkSpring;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public interface DataProcess {
	public Dataset<Row> read();

}
