package Basic_uri_opertions;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class deletedemployee_Test {
	@Test
	public void deleteemp() {
	JSONObject jobj=new JSONObject();
	RequestSpecification Request = RestAssured.given(); 
	Request.body(jobj);
	Request.contentType(ContentType.JSON);
	Response Res = Request.delete("http://localhost:8084/projects/TYP_00603");
	//step3:Validate the response
	//System.out.println(Res.prettyPeek());
	ValidatableResponse Validate = Res.then();
	Validate.log().all();
}}