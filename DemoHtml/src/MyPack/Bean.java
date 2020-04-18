package MyPack;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import java.util.*;
public class Bean {
	
	public static ArrayList<User> ExportUsers(){
		ArrayList<User> list=new ArrayList<User>();
		list.add(new User("Tấn","Tấn"));
		list.add(new User("Xuân", "Xuân"));
		return list;
		
		
	}
}
