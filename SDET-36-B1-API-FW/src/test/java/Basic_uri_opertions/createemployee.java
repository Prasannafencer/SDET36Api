package Basic_uri_opertions;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createemployee {

	@Test
	public void createemployee() {
	//create the project
		baseURI="http://localhost";
		port=8084;
		Random r=new Random();
		int ran=r.nextInt(500);
		//step1:creat the necessary data
		//HTMLCodeGenerator jobj=new HTMLCodeGenerator();
		JSONObject jobj=new JSONObject();
		{
			jobj.put("designation", "QA");
			  jobj.put("dob", "08/08/2021");
			  jobj.put("email", "john123@gmail.com");
			  jobj.put("empId", "RMG_API_Employee_01"+ran);
			  jobj.put("empName", "vishnuprasanna M");
			  jobj.put("experience", "2");
			  jobj.put("mobileNo", "1234567890");
			  jobj.put("password", "john@123");
			  jobj.put("project", "rmgyant1");
			  jobj.put("role", "QA");
			  jobj.put("username", "prasanna M");
			}
		given()
		.body(jobj).contentType(ContentType.JSON).when().post("/addProject").then().log().all();
	//step2:Send the request
		/*RequestSpecification Request = RestAssured.given(); 
		Request.body(jobj);
		Request.contentType(ContentType.JSON);
		Response Res = Request.post("http://localhost:8084/employees");
		//step3:Validate the response
		//System.out.println(Res.prettyPeek());
		ValidatableResponse Validate = Res.then();
		Validate.log().all();*/
		}
}
