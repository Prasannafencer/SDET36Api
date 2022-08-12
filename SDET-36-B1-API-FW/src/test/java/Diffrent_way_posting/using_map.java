package Diffrent_way_posting;

import static io.restassured.RestAssured.baseURI;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class using_map {
	
	@Test
	public void usingmap() {
	Random r=new Random();
	int ran=r.nextInt(500);

baseURI="http://localhost";
port=8084;
HashMap jobj=new HashMap();
jobj.put("createdBy", "prasanna");
jobj.put("projectName", "tyss1"+ran);
jobj.put("status", "On Going");
jobj.put("teamSize", 20);
 
given()
  .body(jobj)
     .contentType(ContentType.JSON)
     .when()
  .post("/addProject")
     .then()
        .log().all();

}}
