package com.gitMigration.gitMigration;

public class AddUser {
	String name;
	int number;
	String userCompName;
	String userEmail;
	
	
	void getUser(String name, int number, String userCompName, String userEmail){
		System.out.println("User Name : "+name+" User Number : "+number+" User Company : "+userCompName+" User Email Id : "+userEmail);
	}
	
	String getUserByNumber(int number) {
		String userName = "";
		if(number == 01) {
			userName = "Anurag";
		}
		return userName;
	}

}
