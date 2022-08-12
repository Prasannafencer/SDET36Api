package Request_chaining;

import org.apache.http.entity.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import projectlibrary.projectlibiray;

import static io.restassured.RestAssured.*;


public class Request_chaining {
	@Test
	public void requestChaining1()
	{


		//Step 1: create a project using POJO
		projectlibiray pLib = new projectlibiray("Prasanna", "rmg", "Completed", 20);
		baseURI = "http://localhost";
		port = 8084;
		
		Response resp = given()
		                  .body(pLib)
		                  .contentType(io.restassured.http.ContentType.JSON)
		                .when()
		                  .post("/addProject");
		
		//capture the project id
		String proId = resp.jsonPath().get("projectId");
		System.out.println(proId);
		System.out.println("get projectid");
		resp.then().log().all();
		
		//Create a get request and pass proID as path parameter
		given()
		 .pathParam("pid", proId)
		.when()
		 .get("/projects/{pid}")
		.then()
		 .log().all();
		 System.out.println("get");


		 given()
		 .pathParam("pid", proId)
		.when()
		 .delete("/projects/{pid}")
		.then()
		 .log().all();
		 System.out.println("deleted");
		
		
	}
	
	
}
