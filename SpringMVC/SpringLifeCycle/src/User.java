
public class User {
	
	int id;
	String name;
	
	User()
	{
		
	}
	User(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void init()
	{
		System.out.println("Init has been called");
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
	
	public void destroy()
	{
		System.out.println("Destroy method is called");
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
