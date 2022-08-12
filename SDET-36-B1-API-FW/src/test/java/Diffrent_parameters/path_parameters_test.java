package Diffrent_parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class path_parameters_test {


	@Test
	public void getSingleProject()
	{
	
		//Pre requisites
		baseURI ="http://localhost";
		port = 8084;
				
		
	given()
	    .pathParam("pid", "TY_PROJ_828")
	      
		//Actions
	    .when()
	      .get("/projects/{pid}")
		
		//Validations
	     .then()
	      .log().all();
	}

}
