package com.amit.SparkSpring;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DataProcessImpl implements DataProcess{
	
    @Autowired
	public SparkSession sparkSession;

	@Override
	public Dataset<Row> read() {
		// TODO Auto-generated method stub
		Dataset<Row> df = sparkSession.read().format("csv").option("header","true").load("C:\\Users\\amitabhat\\Downloads\\Projects\\TROW\\source\\inputfile\\source.csv");
        df.select(("Name")).where("NAME='Ram'").show();
		//df.printSchema();
		return df;
	}

}
