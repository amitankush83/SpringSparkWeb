package com.amit.SparkSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.amit" })
public class SparkSpringApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SparkSpringApplication.class);
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("hadoop.home.dir", "C:\\winutils");
		// Logger.getLogger("org").setLevel(Level.OFF);
		// Logger.getLogger("akka").setLevel(Level.OFF);
		// SpringApplication app = new SpringApplication(SparkSpringApplication.class);
		SpringApplication.run(SparkSpringApplication.class, args);
		// app.setBannerMode(Banner.Mode.OFF);
		// app.run(args);

	}

}
