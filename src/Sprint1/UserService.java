package Sprint1;


public interface UserService {
	
	public boolean validateUserName(String userName);
	public boolean validatePassWord(String passWord);
	public boolean validateEMail(String eMail);
	public boolean validatePhoneNumber(String phoneNumber);
	public void register(User user)throws UserException;
	public boolean login(String str1, String str2)throws UserException;
	public boolean logout(String str)throws UserException;
	
	
}
