package Diffrent_parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class quer_paramaeters {

	@Test
	public void queryParameter()
	{
		
	    baseURI = "https://reqres.in";
	    
	    given()
	     .queryParam("page", 3)
	     
	    .when()
	     .get("/api/users")
	     
	    .then()
	     .log().all();
	}

	
}
