import java.util.List;

public class User {
	
	private int id;
	private String name;
	private Marks marks;
	private Teacher teach;
	
	User()
	{
		System.out.println("The User default constructor has been called");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	
	public Teacher getTeach() {
		return teach;
	}
	public void setTeach(Teacher teach) {
		this.teach = teach;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", marks=" + marks + ", teach=" + teach + "]";
	}
	
	
}
