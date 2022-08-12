package Serilationanddeserilisiton;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationAndDesrilization.empdetails;

public class deserliationemployee {

	@Test
	public void deserliationemp() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
	empdetails empd=obj.readValue(new File(".\\employe.json"),empdetails.class);	
	System.out.println(empd.getid());
	System.out.println(empd.getage());
	System.out.println(empd.getemail());
	System.out.println(empd.getname());
	System.out.println(empd.getphonenumber());
	}
	
}
