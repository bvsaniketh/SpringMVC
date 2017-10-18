import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAMQPPublisher {

	private final static String sender_xml="springamqp-rabbit-sender-context.xml";
	
	public static void main(String args[])
	{
		AmqpTemplate amqpTemplate=(AmqpTemplate) new ClassPathXmlApplicationContext(sender_xml).getBean("amqpTemplate");
		amqpTemplate.convertAndSend("tproutingkey1", "Hello Consumer");
		System.out.println("Message sent succesfully");
	}
}
