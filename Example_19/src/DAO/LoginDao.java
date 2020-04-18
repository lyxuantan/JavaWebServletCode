package DAO;

public class LoginDao {
	
	public static boolean Validate(String name,String pass)
	{
	
		if((name.equals("admin")&&pass.equals("123"))||(name.equals("lyxuantan")&&pass.equals("tuminh2491999")))
		{
			return true;
		}
		return false;
	}
	

}
