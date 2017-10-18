
public class AnswersMap {

	private int qno;
	private int marks;
	private String answer;
	
	
	AnswersMap(int qno,int marks,String answer)
	{
		this.qno=qno;
		this.marks=marks;
		this.answer=answer;
		
	}


	@Override
	public String toString() {
		return "AnswersMap [qno=" + qno + ", marks=" + marks + ", \n answer=" + answer + "]";
	}


	
		
	
}
