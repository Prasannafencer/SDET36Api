package POJOforSerilizationAndDesrilization;

import java.lang.reflect.Array;

public class empdetailswitharray {

String name;
int id;
int []phonenumber;
public String email[];
String address;

public empdetailswitharray()
{
	
}
public empdetailswitharray(String name, int id, int[] phonenumber, String[] email, String address) {
	super();
	this.name = name;
	this.id = id;
	this.phonenumber = phonenumber;
	this.email = email;
	this.address = address;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**w
 * @return the phonenumber
 */
public int[] getPhonenumber() {
	return phonenumber;
}
/**
 * @param phonenumber the phonenumber to set
 */
public void setPhonenumber(int[] phonenumber) {
	this.phonenumber = phonenumber;
}
/**
 * @return the email
 */
public String[] getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String[] email) {
	this.email = email;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
}
