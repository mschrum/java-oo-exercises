package Blogz;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	private String username;
	private String password;
	private static final ArrayList <User> allUsers = new ArrayList<User>();
	
	public User (String username, String password){
		this.username=username;
		this.password= hashPassword(password);
		allUsers.add(this);
	}

	public static String hashPassword(String password){
		return password;
	}
	
	public static ArrayList<User> getAllUsers(){
		return User.allUsers;
	}
	
	public String getUserName(){
		return this.username;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public boolean isValidPassword(String password){
		if (this.password == hashPassword(password)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean isValidUsername(String username){
		 Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		 Matcher m = p.matcher(username);
		 boolean b = m.matches();
		 if (b == false){
			 throw new IllegalArgumentException();
		 }
		 else{
		 return b;}
	}
	
	public static void main(String[] args) {
		User a = new User("Jason", "something");
		User b = new User("Jackson", "something");
		b.isValidPassword("something");
		a.isValidPassword("something");
		for (int i=0; i<User.getAllUsers().size(); i++){
		System.out.println(User.getAllUsers().get(i).getUserName());
		}

	}

}
