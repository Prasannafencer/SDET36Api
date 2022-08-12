package Diffrent_way_posting;

import static io.restassured.RestAssured.*;


import java.util.Random;

import org.apache.http.entity.ContentType;
import org.testng.annotations.Test;

import projectlibrary.projectlibiray;


public class craeteproject {
	@Test
	public void createProjects()
	{
		Random r=new Random();
		int ran=r.nextInt(500);
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 1: create pre requisites
projectlibiray plib=new projectlibiray("prasanna", "rmg"+ran, "completed", 12);		
		given()
		 .body(plib)
	.contentType(io.restassured.http.ContentType.JSON)
		 .when()                 
		 //Step 2: perform action
		 .post("/addProject")
		.then()                          
		//Step 3: validation
		 .log().all();
		
}
}