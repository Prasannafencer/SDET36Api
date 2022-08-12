package Basic_uri_opertions;

import java.util.Random;

import javax.swing.text.html.HTML;

import org.json.simple.JSONObject;
import org.junit.runner.Request;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLObjectElement;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;

import general_utility.iconstnent;
import general_utility.java_utility_test;
import groovyjarjarantlr.HTMLCodeGenerator;
import  static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class create_projectTest   {
@Test

public void createtheproject() {
	baseURI="http://localhost";
	port= 8084;
	//create the project
	Random r=new Random();
	int ran=r.nextInt(500);
	//step1:creat the necessary data
	
			
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "prasanna");
	jobj.put("projectName", "tyss1"+ran);
	jobj.put("status", "ongoing");
	jobj.put("teamSize", 20);
	//step2:Send the request
	//RestAssured Request=RestAssured.given();
	//RequestSpecification Request = RestAssured.given(); 
	given()
	.body(jobj)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.log().all();
	//Request.body(jobj);
	//Request.contentType(ContentType.JSON);
	//Response Res = Request.post("http://localhost:8084/addProject");
	//step3:Validate the response
	//System.out.println(Res.prettyPeek());
	//ValidatableResponse Validate = Res.then();
	//Validate.log().all();
	}

@Test

public void createtheproject1() {
	java_utility_test jlib=new java_utility_test();
	//create the project
	
	Random r=new Random();
	int ran=r.nextInt(500);
	//step1:creat the necessary data
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "rmg");
	jobj.put("createdOn", "08/08/2021");
	jobj.put("projectId", "RMG_API_Project _01");
	jobj.put("status", "created");
	jobj.put("teamSize", "10");
//step2:Send the request
	RequestSpecification Request = RestAssured.given(); 
	Request.body(jobj);
	Request.contentType(ContentType.JSON);
	Response Res = Request.post("http://localhost:8084/addProject");
	//step3:Validate the response
	//System.out.println(Res.prettyPeek());
	ValidatableResponse Validate = Res.then();
	Validate.log().all();
	}

@Test

public void createtheprojecthtml() {
	java_utility_test jlib=new java_utility_test();
	
	//create the project
	/*Random r=new Random();
	int ran=r.nextInt(500);*/
	//step1:creat the necessary data
	//HTMLCodeGenerator jobj=new HTMLCodeGenerator();
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "rmg");
	jobj.put("createdOn", "08/08/2021");
	jobj.put("projectId", "RMG_API_Project_06"+jlib.getRanDomnumber());
	jobj.put("status", "created");
	jobj.put("teamSize", "10");
//step2:Send the request
	RequestSpecification Request = RestAssured.given(); 
	Request.body(jobj);
	Request.contentType(ContentType.JSON);
	Response Res = (Response) Request.post(iconstnent.dburl,iconstnent.dbport/addProject").getBody();
	//step3:Validate the response
	//System.out.println(Res.prettyPeek());
	ValidatableResponse Validate = Res.then();
	Validate.log().all();
	}


}
