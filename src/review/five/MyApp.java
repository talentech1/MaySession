package review.five;

import java.util.Date;

public class MyApp {
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Date oneDateOfBirth = new Date(2000, 1, 10);
		User one = new User("Talent", "Tech", oneDateOfBirth, "tealenttech@gmail.com");
		
		Date twoDob = new Date(2022,11,11);
		User two = new User("Tom", "Cruze", twoDob, "tcruz@gmail");
		
		User[] allUsers = {one, two};
		
		for(int i = 0; i< allUsers.length; i++ ) {
			allUsers[i].emailUser("Hello!!");
		}
		
	}

}
