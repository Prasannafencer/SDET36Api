package Serilationanddeserilisiton;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import POJOforSerilizationAndDesrilization.empdetailswitharray;

public class deserilizationarray {
	
	@Test
	public void deserliationemp() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		empdetailswitharray empid=obj.readValue(new File("./employeearray1.json"),empdetailswitharray.class);	
	
System.out.println(empid.getPhonenumber());
System.out.println(empid.getEmail());
	System.out.println(empid.getId());
	}}
