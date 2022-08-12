package baresr_tokens_test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class barer_tokens {

@Test
public void bearerToken()
{

	baseURI ="https://api.github.com";
	HashMap map = new HashMap();
	map.put("name", "sdet36restAssured");
	
	given()
	 .auth()
	 .oauth2("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")
	 .body(map)
	 .contentType(ContentType.JSON)
	 
    .when()
     .post("/user/repos")
     
    .then().log().all();
}}


