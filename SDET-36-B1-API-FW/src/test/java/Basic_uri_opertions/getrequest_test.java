package Basic_uri_opertions;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class getrequest_test {
	@Test
	public void getrequest()
	{
		baseURI="http://localhost";
		port=8084;
		JSONObject jobj=new JSONObject();
		given().body(jobj).contentType(ContentType.JSON).when().get("/projects").then().log().all();
		
		/*RequestSpecification Request = RestAssured.given(); 
		Request.body(jobj);
		Request.contentType(ContentType.JSON);
		Response Res = Request.get("http://localhost:8084/projects/TY_PROJ_807");
		//step3:Validate the response
		//System.out.println(Res.prettyPeek());
		ValidatableResponse Validate = Res.then();
		Validate.log().all();*/
		}


}
