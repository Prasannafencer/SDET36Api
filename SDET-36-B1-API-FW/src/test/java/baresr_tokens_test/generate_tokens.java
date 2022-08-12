package baresr_tokens_test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class generate_tokens {

	@Test
	public void oauthAuthentication()
	{
		baseURI="http://coop.apps.symfonycasts.com";
		//Create a request to generate accesss token 
		Response resp = given()
		 .formParam("client_id", "Sdet36Rest")
		 .formParam("client_secret", "72c92a92069427bbc03adb7468326921")
		 .formParam("grant_type", "client_credentials")
		 .formParam("redirect_uri", "http://prasanna.com")
		 .formParam("code", "authorization_code")
		 
	    .when()
	     .post("/token");
	     
	    //Capture the access token from the response of the above request
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		
		//Create another request and use the token to access the APIs
		given()
		 .auth().oauth2(token)
		 .pathParam("USER_ID", 3674)
		 
		.when()
		 .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-collect")
		 
		.then().log().all();
		 
		 
	}

	
}
