




package com.keyhole.amqp;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
/**
 * This class implements org.springframework.amqp.core.MessageListener.
 *  It is tied to TUTORIAL_EXCHANGE and listing to an anonomous queue
 *  which picks up message in the  TUTORIAL_EXCHANGE with a routing pattern of
 *  my.routingkey.1  specified in rabbt-listener-contet.xml file.
 */
public class TutorialListener implements MessageListener {
public TutorialListener(){
	System.out.println("creating TutorialListener...");
}
	public void onMessage(Message message) {
	String messageBody= new String(message.getBody());
		System.out.println("Listener received message----->"+messageBody);
	}
}
//end of TutorialListener.
/* You can imagine the possibilities f using this listener to process jobs asynchronously. You can invoke a Spring Batch jobs if you want.
 * 
 * 
 * */
