import java.util.Map;

public class Players {
	
	private String clubname;
	private int age;
	private Map<Integer,String>info;
	

	public String getClubname() {
		return clubname;
	}
	public void setClubname(String clubname) {
		this.clubname = clubname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<Integer, String> getInfo() {
		return info;
	}
	public void setInfo(Map<Integer, String> info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Players [clubname=" + clubname + ", age=" + age + ", info=" + info + "]";
	}
	
	
	
	
	
}
