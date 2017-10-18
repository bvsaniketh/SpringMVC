import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap {
	private int id;
	private String name;
	///private Map<String,String> answers;
	private Map<AnswersMap,UserMap> answers;
	
	QuestionMap(int id,String name,Map<AnswersMap,UserMap> answers)
	{
		this.id=id;
		this.name=name;
		this.answers=answers;
	}

	void display()
	{
		System.out.println("The id in the List is " +id+ " and The name in the List is "+ name );
	}
	@Override
	public String toString() {
		return "QuestionMap [id=" + id + ", name=" + name + ", \n answers=" + answers + "]";
	}
	
	
	
	
	
	
	
}
