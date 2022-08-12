package Diffrent_parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class form_parameters {
	@Test
	public void parametersTest()
	{
		
		baseURI = "http://localhost";
		port = 8084;
		
		
		given()
		 .formParam("projects","projects")
		
		 //.formParam("per_page", 30)
		 //.formParam("page", 1)
		 
		.when()
		 .get("{projects}")
		.then() 
		.log().all();
	}
}
