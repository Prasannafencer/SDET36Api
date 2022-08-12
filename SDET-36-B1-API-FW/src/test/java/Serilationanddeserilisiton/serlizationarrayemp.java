package Serilationanddeserilisiton;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
import POJOforSerilizationAndDesrilization.empdetailswitharray;

public class serlizationarrayemp {
	int phonenumber[]= {1234,13455};
String email[]= {"123@gmail.com","123@gmail.com"};
	@Test
public void Serlization() throws JsonGenerationException, JsonMappingException, IOException
{
	
	//step1:create object of pojo and provide vales
	empdetailswitharray emp=new empdetailswitharray("prasanna", 123,phonenumber, email, "ncbxz") ;
	
//step2:cretae object of object Mapper from jackson mapeer
	ObjectMapper obj=new ObjectMapper();
	//step3:write data into json file
obj.writeValue(new File("./employeearray1.json"),emp);
}


}
