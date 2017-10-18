
public class User {
	
	private int id;
	private String name;
	private Marks marks;
	private Teacher teach;
	
	User(int id,String name,Marks marks,Teacher teach)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.teach=teach;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", marks=" + marks + ", teach=" + teach + "]";
	}
	
	

}
