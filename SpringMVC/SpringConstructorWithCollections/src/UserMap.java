
public class UserMap {
	private String answerby;
	private int userrank;
	
	UserMap(String answerby,int userrank)
	{
		this.answerby=answerby;
		this.userrank=userrank;
	}

	@Override
	public String toString() {
		return "UserMap [answerby=" + answerby + ", userrank=" + userrank + "]";
	}
	
	
}
