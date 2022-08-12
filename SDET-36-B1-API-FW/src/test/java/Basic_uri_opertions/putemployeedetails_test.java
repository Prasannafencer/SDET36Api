package Basic_uri_opertions;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class putemployeedetails_test {

	@Test
	public void putrequest()
	{
	JSONObject jobj=new JSONObject();
		
		jobj.put("createdBy", "vishnuprasanna");
		jobj.put("projectName", "tyss1");
		jobj.put("status", "done");
		jobj.put("teamSize", 20);
		RequestSpecification Request = RestAssured.given(); 
		Request.body(jobj);
		Request.contentType(ContentType.JSON);
		Response Res = Request.put("http://localhost:8084/projects/TY_PROJ_807");
		//step3:Validate the response
		//System.out.println(Res.prettyPeek());
		ValidatableResponse Validate = Res.then();
		Validate.log().all();
		}

}