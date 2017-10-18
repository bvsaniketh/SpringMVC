
public class Address {
	private int flatno;
	private String building;
	private String city;
	
	Address()
	{
		
	}
	
	Address(int flatno,String building,String city)
	{
		this.flatno=flatno;
		this.building=building;
		this.city=city;
	}
	
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", building=" + building + ", city=" + city + "]";
	}
	
	
}
