package Request_chaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import projectlibrary.projectlibiray;

public class task_test {

	@Test
	public void requestChaining1()
	{


		//Step 1: create a project using POJO
		projectlibiray pLib = new projectlibiray("vishnuPrasanna", "rmg", "Completed", 20);
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
		resp.then()
		                          //Step 3: validation
		 .assertThat().statusCode(201)
		.log().all();
		
		
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
