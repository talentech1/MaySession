package review.five;

import java.util.Date;

public class User {
	String firstName;
	String lastName;
	Date dateOfBirth; 
	String email;
	
	public User(String firstName, String lastName, Date dateOfBirth, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}
	
	public void printUser() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(dateOfBirth);
		System.out.println(email);
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public void emailUser(String content) {
		System.out.println("emailing " + this.email );
		System.out.println("email content: " + content);
	}
	
	

}
