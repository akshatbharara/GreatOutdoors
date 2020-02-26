package Sprint1;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {
	UserServiceImpl obj=new UserServiceImpl();
	//UserConsole userConsole = new UserConsole();

	//@Test
//	public void testName() {
//		
//		assertEquals(false,userConsole.nameCheck(""));
//	}
//	@Test
//	public void testNum(){
//		assertEquals(true, userConsole.numCheck("9874561230"));
//	}

	@Test
	public void testPassword(){
		assertEquals(true, obj.validatePassWord("Akshat@123"));
	}
	@Test
	public void testEmail(){
		assertEquals(true, obj.validateEMail("bhararaakshat@gmail.com"));
	}
	@Test
	public void testUsername(){
		assertEquals(true, obj.validateUserName("a11"));
	}
	
	@Test
	public void testPhoneNum(){
		assertEquals(true, obj.validatePhoneNumber("9794823570"));
	}

}
