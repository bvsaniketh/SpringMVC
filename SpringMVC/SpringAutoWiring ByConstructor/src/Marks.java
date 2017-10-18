
public class Marks {
	
	private String school;
	private int score;
	private int rank;
	
	Marks()
	{
		System.out.println("The Marks default constructor has been called");
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Marks [school=" + school + ", score=" + score + ", rank=" + rank + "]";
	}
	
	
}
