package Serilationanddeserilisiton;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationAndDesrilization.empwithspouse;
import POJOforSerilizationAndDesrilization.spouse;

public class seriliationempwithspouse {

	int phonenumber[]= {1234,13455};
	String email[]= {"123@gmail.com","123@gmail.com"};
		@Test
	public void Serlization() throws JsonGenerationException, JsonMappingException, IOException
	{
			spouse sp=new spouse("abdah","hga76",65,phonenumber,email);
			
	
empwithspouse emps=new empwithspouse("prasanna", "xfvx7", 26, phonenumber, email, sp);
ObjectMapper obj=new ObjectMapper();
//step3:write data into json file
obj.writeValue(new File("./employewithspouse.json"),emps);
}
}