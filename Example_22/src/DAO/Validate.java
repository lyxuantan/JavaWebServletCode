package DAO;

public class Validate {
	public static boolean Check(String pass) {
		
		boolean t=false;
		if(pass.equals("123")) {
			return true;
		}
		return false;
	}
}
