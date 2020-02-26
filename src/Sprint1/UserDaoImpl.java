package Sprint1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDaoImpl implements UserDao {

	private Map<String,User> map;
	User user = null;
	public UserDaoImpl(){
		map = new HashMap<String, User>();
	}
	public void register(User user) throws UserException{
		if(!map.containsKey(user.getUserName())){
			map.put(user.getUserName(), user);
		System.out.println("Registered sucessfully");
		}
		else{
			throw new UserException("ID already exists");
		}
	}
	public boolean login(String str1, String str2)throws UserException{
		if(map.containsKey(str1)){
			User user = map.get(str1);
			if(user.isStatus()== true){
				throw new UserException("You are already logged in.");
				
				
			}
			if(user.getPassWord().equals(str2))
			{
				user.setStatus(true);
			}
			System.out.println("Logged in Successfully");
			return true;
		}
		else{
			throw new UserException("You have not registered.");
		}
	}
	public boolean logout(String str)throws UserException{
		boolean status = false;
		if(!map.containsKey(str))
		{
			throw new UserException("You are not logged in.");
		}
		User user = map.get(str);
		boolean flag = user.isStatus();
		if(flag == true){
			status = false;
		}
		System.out.println("Logged out Successfully");
		return status;
	}
}
