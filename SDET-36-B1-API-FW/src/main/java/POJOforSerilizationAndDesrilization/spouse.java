package POJOforSerilizationAndDesrilization;

public class spouse {
String name;

String id;
int age;
int []phonenumber;
String email[];
/**
 * @return the name
 */
public String getName() {
	return name;
}
public spouse(String name, String id, int age, int[] phonenumber, String[] email) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
	this.phonenumber = phonenumber;
	this.email = email;
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
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
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

}
