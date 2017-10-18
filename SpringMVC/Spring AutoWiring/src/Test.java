
public class Test {

	public static void main(String args[])
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	User user=context.getBean("user");
	System.out.println(user);
	}
}	
