import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAMQPListener {

	public static void main(String args[])
	{
		new ClassPathXmlApplicationContext("springamqp-rabbit-listener-context.xml");
	}
}
