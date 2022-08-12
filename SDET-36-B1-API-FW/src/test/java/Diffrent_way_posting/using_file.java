package Diffrent_way_posting;

import java.io.File;
import java.io.FileInputStream;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class using_file {
@Test
public void using()
{
	
	//Step 1: create pre requisites
	
			File file = new File(".\\src\\test\\resources\\object.json");
			baseURI = "http://localhost";
			port = 8084;
			given()
			 .body(file)
			 .contentType(ContentType.JSON)
			.when()                       
			//Step 2: perform Action
			 .post("/addProject")
			.then()                    
			//Step 3: Validation
			 
			 .log().all();
			
		}


}
