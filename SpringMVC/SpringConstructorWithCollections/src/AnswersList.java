
public class AnswersList {

	private int id;
	private String marks;
	private String answer;
	private String answerby;
	
	AnswersList(int id,String marks,String answer,String answerby)
	{
		this.id=id;
		this.marks=marks;
		this.answer=answer;
		this.answerby=answerby;
	}

	@Override
	public String toString() {
		return "\n AnswersList [id=" + id + ", marks=" + marks + ", answer=" + answer + ", answerby=" + answerby + "]";
	}
	
	
}
