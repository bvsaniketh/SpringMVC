import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
		
	public static void main(String args[])
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Players player=(Players) context.getBean("SetterPlayer");
	System.out.println(player);
	PlayersDependMap playermap=(PlayersDependMap) context.getBean("PlayerDetails");
	System.out.println(playermap);
	}
}
