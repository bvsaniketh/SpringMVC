import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Employee emp=(Employee) context.getBean("emp");
	System.out.println(emp);
	emp.show();
	}
}
