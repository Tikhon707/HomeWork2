package com.javarepos.javaproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaprojApplication {

	public static void main(String[] args) {
		JavaDevelopment javaDevelopment = new JavaDevelopment();
		HiringDepartment hiringDepartment = new HiringDepartment(javaDevelopment);

		hiringDepartment.displayInfo();
	}

}
