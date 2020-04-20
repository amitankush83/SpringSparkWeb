package com.amit.SparkSpring.controllers;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.SparkSpring.DataProcess;
import com.amit.SparkSpring.Library;

@RestController

public class SparkController {
	
	@Autowired
	private Library libary;
	@Autowired
	DataProcess dataProcess;
   
	@RequestMapping("/spark")
	public String sparkProcessData() {
		libary.someLibraryMethod();
		Dataset<Row> df=dataProcess.read();
		return "sparkdf";
	}
	 @RequestMapping("/")
	    String home() {
	        return "Hello World Spring Boot!";
	    }

}
