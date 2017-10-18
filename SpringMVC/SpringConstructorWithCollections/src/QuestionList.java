import java.util.Iterator;
import java.util.List;

public class QuestionList {

	private int id;
	private String name;
	//private List<String> answers;
	private List<AnswersList> answers;
	
	QuestionList(int id,String name,List<AnswersList> answers)
	{
		this.id=id;
		this.name=name;
		this.answers=answers;
	}

	void display()
	{
		System.out.println(id+" "+ name );
		Iterator<AnswersList> itr=answers.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	@Override
	public String toString() {
		return "QuestionList [id=" + id + ", name=" + name + ", \n answers=" + answers + "]";
	}
	
}
