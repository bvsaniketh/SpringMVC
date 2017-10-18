import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[])
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//	QuestionList question=(QuestionList)context.getBean("que");
//	System.out.println(question);
//	QuestionMap qmap=(QuestionMap)context.getBean("quemap");
//	System.out.println(qmap);
	Employee ee =(Employee) context.getBean("emptwo");
	System.out.println(ee);
	QuestionMap qmap1=(QuestionMap)context.getBean("quemapdepend");
	System.out.println(qmap1);
	}
}
