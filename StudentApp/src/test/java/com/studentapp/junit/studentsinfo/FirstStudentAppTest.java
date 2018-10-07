package com.studentapp.junit.studentsinfo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)

public class FirstStudentAppTest {

	@BeforeClass
	public static void init1() {
		 RestAssured.baseURI ="http://localhost:8080/student";
		}
	
	@Test
	public void getAllStudent() {
		RestAssured.given()
		.when()
		.get("/list")
		.then()
		.log()
		.all()
		.statusCode(200);
		
	}
}
