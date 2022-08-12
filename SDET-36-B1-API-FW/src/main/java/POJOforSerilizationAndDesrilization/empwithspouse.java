package POJOforSerilizationAndDesrilization;

public class empwithspouse {
String name;
String id;
int age;
int []phonenumber;
String email[];
spouse spouse;
public empwithspouse(String name, String id, int age, int[] phonenumber, String[] email,
		POJOforSerilizationAndDesrilization.spouse spouse) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
	this.phonenumber = phonenumber;
	this.email = email;
	this.spouse = spouse;
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
/**
 * @return the spouse
 */
public spouse getSpouse() {
	return spouse;
}
/**
 * @param spouse the spouse to set
 */
public void setSpouse(spouse spouse) {
	this.spouse = spouse;
}

}
