package Endtoend_scanrio;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import general_utility.Baseclass_test;
import general_utility.Endpoint_library;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import projectlibrary.projectlibiray;

public class create_project {

	public class CreateProjectVerifyInDatabase extends Baseclass_test {
		
		@Test
		public void createPVerifyInDB() throws SQLException
		{
		   //Step 1: create pre requisites
		   projectlibiray pLib = new projectlibiray("Prasanna M", "RMG"+jLib.getRandomNum(), "Created", 12);
			
		   //Step 2: send the request
		  Response response = RestAssured.given()
				  				.body(pLib)
				  				.contentType(ContentType.JSON)
				  				.when()
				  				.post(Endpoint_library.createProject);
		
		   //Step 3: capture the project ID
		  String expData = rLib.getJsonData(response, "projectId");
		  Reporter.log(expData,true);
			
		   //Step 4: validate the id in database
		  String query = "select * from project;";
		  String actData=getdLib().readDataFromDBAndValidate(query, 1, expData);
		  
		  Assert.assertEquals(expData, actData);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		}

	}
}
