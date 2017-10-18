
public class Employee {

	private String name;
	private int id;
	private int age;
	private String company;
	private Address address;
	
	Employee(String name,int id,int age,String company,Address address)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.company=company;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", company=" + company + "] +" + address;
	}
	public void show()
	{
		System.out.println(address.toString());
	}
	
	
}
