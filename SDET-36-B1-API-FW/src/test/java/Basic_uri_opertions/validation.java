package Basic_uri_opertions;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


import java.net.URI;

public class validation {

	@Test
	public void check()
	{
		//String exp="TY_PROJ_827";
		baseURI="http://localhost";
		port=8084;
		Response res=when()
				.get("/projects");
		
		 Object pid = res.jsonPath().get("projectId");
		System.out.println(pid);
		
			
		res.then().log().all();
	}
				
				
				
			
}
