package Sprint1;


public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	public UserServiceImpl(){
		userDao = new UserDaoImpl();
	}
	public boolean validateUserName(String username){
		boolean flag = username.matches("^[a-zA-Z0-9]+$");
		return flag;
	}
	public boolean validatePassWord(String passWord){
		boolean	flag=passWord.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		return flag;
	}
	public boolean validateEMail(String eMail){
		boolean flag = eMail.matches("^(.+)@(.+)$");
		return flag;
	}
	public boolean validatePhoneNumber(String phoneNumber){
		boolean flag = false;
		flag = phoneNumber.matches("[0-9]{10}+");
		return flag;
	}
	public void register(User user)throws UserException{
		String userName = user.getUserName();
		boolean flag1 = validateUserName(userName);
		if(!flag1){
			throw new UserException("Username should contain alphabets and digits");
		}
		String passWord = user.getPassWord();
		boolean flag2 = validatePassWord(passWord); 
		if(!flag2){
			throw new UserException("Password should contain atleast one Uppercase character, Lowercase character, one digit, and one special character");
		}
		String phoneNumber = user.getPhoneNum();
		boolean flag3 = validatePhoneNumber(phoneNumber);
		if(!flag3){
			throw new UserException("Invalid Phone Number");
		}
		String emailId  = user.getEmail();
		boolean flag4 = validateEMail(emailId);
		if(!flag4){
			throw new UserException("Invalid E-mail ID");
		}
		userDao.register(user);
	}
	public boolean login(String str1, String str2)throws UserException{
		boolean flag1 = validateUserName(str1);
		if(!flag1){
			throw new UserException("Username should contain alphabets and digits");
		}
		boolean flag2 = validatePassWord(str2);
		if(!flag2){
			throw new UserException("Password should contain atleast one uppercase character, lowercase character, one digit, and one special character");
		}
		return userDao.login(str1, str2);
	}
	public boolean logout(String str)throws UserException{
		boolean flag1 = validateUserName(str);
		if(!flag1){
			throw new UserException("Username should contain alphabets and digits");
		}
		return userDao.logout(str);
	}
}
