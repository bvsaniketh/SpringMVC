import java.util.Map;

public class PlayersDependMap {
	
	private String clubname;
	private int age;
	private Map<Statistics,Manager>info;
	
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
	public Map<Statistics, Manager> getInfo() {
		return info;
	}
	public void setInfo(Map<Statistics, Manager> info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "PlayersDependMap [clubname=" + clubname + ", age=" + age + ", info=" + info + "]";
	}
	
	
	
}
