



import java.util.List;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgeit.aniketh.mybetisdemo.User;
import com.bridgeit.aniketh.mybetisdemo.UserService;

import junit.framework.Assert;

public class UserServiceTest  {
	
	
	private static UserService service;
	@BeforeClass
	public static void setup()
	{
		service=new UserService();
	}
	
	@AfterClass
	public static void teardown()
	{
		service=null;
	}
	
	@Test
	public void testinsertUser()
	{
		User user = new User();
		user.setEmailid("bharathi12345");
		user.setFirstname("Bharathi");
		user.setLastname("Cool");
		user.setPassword("bridgeit");
		
		  service.insertUser(user);
		  Assert.assertTrue(user.getUserid() != 0);
//		  //User createdUser = service.getUserById(user.getUserid());
//		  Assert.assertNotNull(createdUser);
//		  Assert.assertEquals(user.getEmailId(), createdUser.getEmailId());
//		  Assert.assertEquals(user.getPassword(), createdUser.getPassword());
//		  Assert.assertEquals(user.getFirstName(), createdUser.getFirstName());
//		  Assert.assertEquals(user.getLastName(), createdUser.getLastName());
	}
	
	@Test
	public void testgetUserbyId()
	{
		User user=service.getUserById(1);
		Assert.assertNotNull(user);
		System.out.println(user);
		
	}
	
	@Test
	public void testgetAllUser()
	{
		List<User> users =service.getAllUsers();
		Assert.assertNotNull(users);
		for(User user:users)
		{
			System.out.println(user);
		}
	}

	@Test
	public void testUpdateUser()
	{
		User user=service.getUserById(5);
		user.setFirstname("Rocky");
		user.setLastname("Handsome");
		service.updateUser(user);
		User updateuser=service.getUserById(5);
		Assert.assertEquals(user.getFirstname(), updateuser.getFirstname());
		Assert.assertEquals(user.getLastname(), updateuser.getLastname());
		
	}
	@Test
	public void testDeleteUser()
	{
		service.deleteUser(6);
		User user=service.getUserById(6);
		Assert.assertNull(user);
		System.out.println("Deleted the user as per ID");
		
	}
}
