import java.net.URI;
import java.net.URISyntaxException;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJMS {
	public static void main(String args[]) throws URISyntaxException, Exception
	{
		/*BrokerService broker=BrokerFactory.createBroker(new URI("tcp://localhost:61616"));
		broker.start();*/
		
		for(int i=0;i<10;i++)
		{		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringJmsProducer springJmsProducer=(SpringJmsProducer) context.getBean("springJmsProducer");
		springJmsProducer.sendMessage("Hey Dude");
		SpringJmsConsumer springJmsConsumer=(SpringJmsConsumer) context.getBean("springJmsConsumer");
		System.out.println("Consumer recieves " + springJmsConsumer.receiveMessage());
		
		}
		/*finally 
		{
		broker.stop();
		context.close();
		}*/
		
		
	}
}
