package Basic_uri_opertions;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class get_single_request_test {
	@Test
	public void getsinglerequest()
	{
		JSONObject jobj=new JSONObject();
	
		RequestSpecification Request = RestAssured.given(); 
		Request.body(jobj);
		Request.contentType(ContentType.JSON);
		Response Res = Request.get("http://localhost:8084/projects/TY_PROJ_2608");
		//step3:Validate the response
		//System.out.println(Res.prettyPeek());
		ValidatableResponse Validate = Res.then();
		Validate.log().all();
		}


}
