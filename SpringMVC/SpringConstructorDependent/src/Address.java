
public class Address {
	
	private int flatno;
	private String city;
	
	Address(int flatno,String city)
	{
		this.flatno=flatno;
		this.city=city;
	}
	
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", city=" + city + "]";
	}
		
	
}
