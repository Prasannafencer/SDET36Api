package POJOforSerilizationAndDesrilization;

public class empdetails {
String name;
String id;
int age;
String email;
int phonenumber;
public empdetails(String name, String id, int age, int phonenumber) {
	this.name = name;
	this.id = id;
	this.age = age;
	this.phonenumber = phonenumber;}
 public empdetails()
{
	}
public String getname()
{
return name;	
}
public String getid()
{
return id;	
}
public int getage()
{
return age;	
}
public int getphonenumber()
{
return phonenumber;	
}
public String getemail()
{
return email;	
}

}
