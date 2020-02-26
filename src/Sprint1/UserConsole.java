package Sprint1;

import java.util.Scanner;
import java.util.List;

public class UserConsole {
//	public static  boolean nameCheck(String username){
//		boolean res = true;
//		if(username.length() == 0){
//			res = false;	
//		}
//		return res;
//	}
//	public static boolean numCheck( String phonenumber){
//		boolean flag = false;
//		if(phonenumber.charAt(0)=='9' || phonenumber.charAt(0)=='8' ||phonenumber.charAt(0)=='7'){
//			flag = true;
//		}
//		return flag;
//	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		UserService userService=new UserServiceImpl();
		int choice = 0;
		User user = null;
		//List<User> list= null;
		while(true){
			
			System.out.println("1. Register yourself");
			System.out.println("2. LogIn");
			System.out.println("3. LogOut");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
		
		switch(choice){
		case 1:  //Registration 
		{
			try{
				System.out.println("Enter your Username: ");
				sc.nextLine();
				String username = sc.nextLine();
				//System.out.println(nameCheck(username));
			    System.out.println("Enter your password: ");
			    String password = sc.nextLine();
			    System.out.println("Re-Enter your password: ");
			    String password1 = sc.nextLine();
			    System.out.println("Enter your e-mail ID: ");
			    String emailid = sc.nextLine();
			    System.out.println("Enter your Phone Number: ");
			    String phonenumber = sc.nextLine();
			    //System.out.println(numCheck(phonenumber));
			    user = new User();
			    user.setUserName(username);
			    user.setPassWord(password);
			    user.setEmail(emailid);
			    user.setPhoneNum(phonenumber);
			    if(password.equals(password1)){
			    	 userService.register(user);
			    }
			    else{
			    	System.out.println("Password does not matches");
			    }
			    
			}
			catch(Exception e){
				System.out.println(e);
			}
			//System.out.println("Registered Successfully");
			}
		break;
		case 2:{	
			//Login
			try{
				
			
			sc.nextLine();
			System.out.println("Enter Username to LogIn:");
			String username1 = sc.nextLine();
			System.out.println("Enter your Password: ");
			String password1 = sc.nextLine();
			userService.login(username1, password1);
			//
			}catch(Exception e1){
				System.out.println(e1);
			}
			//System.out.println("Logged In Successfully");
			
		}
		break;
		case 3:{			//Logout
			try{
			sc.nextLine();
			System.out.println("Enter your Username");
			String username1 = sc.nextLine();
			userService.logout(username1);
			//System.exit(0);
					}
		
		catch(Exception e){
			System.out.println(e);
		}
			//System.out.println("Logged Out Successfully");

		}
		break;
		
		case 4:{		//Exit
			System.out.println("Thank You!! :)");
			return;
		}
		
	}
		}		
		
}
}

		
	


