package Basic_uri_opertions;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class delete_request_test {

	@Test
	public void deleterequest()
	{
		baseURI="http://localhost";
		port=8084;
		JSONObject jobj=new JSONObject();
		given().body(jobj).contentType(ContentType.JSON).when().delete("/projects/").then().log().all();
		
		/*RequestSpecification Request = RestAssured.given(); 
		Request.body(jobj);
		Request.contentType(ContentType.JSON);
		Response Res = Request.delete("http://localhost:8084/projects/TY_PROJ_829");
		//step3:Validate the response
		//System.out.println(Res.prettyPeek());
		ValidatableResponse Validate = Res.then();
		Validate.log().all();*/
		}


}
