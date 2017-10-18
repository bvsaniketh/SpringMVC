import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[])
	{
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	User user=(User)context.getBean("userdetails");
	System.out.println(user);
	User user1=(User)context.getBean("userdetails");
	System.out.println(user1 + "For the singleton scope ");
	User user2=(User)context.getBean("userdetailspro");
	user2.setId(350);
	System.out.println(user2);
	User user3=(User)context.getBean("userdetailspro");
	System.out.println(user3 + "	For the prototype scope ");
	context.registerShutdownHook();
	//user1.setId(170);
	
	}
}
