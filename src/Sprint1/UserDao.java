package Sprint1;
import java.util.List;
public interface UserDao {
	public void register(User user)throws UserException;;
	public boolean login(String str1 , String str2)throws UserException;;
	public boolean logout(String str) throws UserException;;
	
	
	//public List<User> ViewAllUsers();

}
