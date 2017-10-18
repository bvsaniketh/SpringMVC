import java.util.List;

public class Teacher {

	private List<String>tname;

	public List<String> getTname() {
		return tname;
	}

	public void setTname(List<String> tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Teacher [tname=" + tname + "]";
	}
	
	
	
	
	
}
