package com.gitMigration.gitMigration;

public class AddUser {
	String name;
	int number;
	String userCompName;
	
	void getUser(String name, int number, String userCompName){
		System.out.println("User Name : "+name+" User Number : "+number+" User Company : "+userCompName);
	}
	
	String getUserByNumber(int number) {
		String userName = "";
		if(number == 01) {
			userName = "Anurag";
		}
		return userName;
	}

}
