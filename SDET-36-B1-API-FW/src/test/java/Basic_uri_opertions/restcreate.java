package Basic_uri_opertions;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class restcreate {
@Test
public void restassert()
{
	Random r=new Random();
	int ran=r.nextInt(500);

baseURI="http://localhost";
port=8084;
JSONObject jobj=new JSONObject();
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
        .statusCode(201).log().all();


}

}
