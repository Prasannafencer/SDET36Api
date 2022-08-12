package Serilationanddeserilisiton;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationAndDesrilization.empdetails;

public class Seriliationemployedetails {
@Test


public void Serlization() throws JsonGenerationException, JsonMappingException, IOException
{
	//step1:create object of pojo and provide vales
	empdetails emp=new empdetails("prasanna", "TY786", 26, 1234544);
//step2:cretae object of object Mapper from jackson mapeer
	ObjectMapper obj=new ObjectMapper();
	//step3:write data into json file
obj.writeValue(new File("./employe.json"), emp);
}
	
}
