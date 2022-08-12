package Basic_uri_opertions;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class put_request_test {

	@Test
	public void putrequest()
	{
		baseURI="http://localhost";
		port=8084;
		JSONObject jobj=new JSONObject();
		
		jobj.put("designation", "QA");
		  jobj.put("dob", "01/11/1111");
		  jobj.put("email", "john123@gmail.com");
		  jobj.put("empId", "TYP_00604");
		  jobj.put("empName", "prasanna M");
		  jobj.put("experience", 2.0);
		  jobj.put("mobileNo", "1234567890");
		  jobj.put("password", "$2a$10$yzE2gg5fTpaqIrBAZZrXHOXVMsUFj6TGYfsZWybVP7xj8vEG/l.9K");
		  jobj.put("project", "rmgyan");
		  jobj.put("role", "QA");
		  jobj.put("username", "vishnuprasanna M");

		  given().body(jobj).contentType(ContentType.JSON).when().put("/employees/TYP_00604").then().log().all();
			
		 /* RequestSpecification Request = RestAssured.given(); 
		Request.body(jobj);
		Request.contentType(ContentType.JSON);
		Response Res = Request.put("http://localhost:8084/employees/TYP_00604");
		//step3:Validate the response
		//System.out.println(Res.prettyPeek());
		ValidatableResponse Validate = Res.then();
		Validate.log().all();*/
		}

}
