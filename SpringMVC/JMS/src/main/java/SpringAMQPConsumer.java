import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class SpringAMQPConsumer implements MessageListener {

	public void onMessage(Message msg) {
		
		System.out.println("Recieved Message by Consumer is : " + new String(msg.getBody()));
		
	}

}
