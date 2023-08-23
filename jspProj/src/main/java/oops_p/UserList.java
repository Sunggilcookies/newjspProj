package oops_p;

import java.util.ArrayList;


public class UserList {
	
	ArrayList<User> Users;
	
	public UserList() {
	// TODO Auto-generated constructor stub
	}
	public ArrayList<User> getUsers() {
		return Users;
	}


	@Override
	public String toString() {
		return "UserList [Users=" + Users + "]";
	}
	
}
