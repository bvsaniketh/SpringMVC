import com.bridgeit.Model.Login;
import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;
import org.junit.BeforeClass;

public class JUnitTest {

	@BeforeClass
	public static void init() {
		RestAssured.port = 8080;
		//RestAssured.baseURI = "https://www.googleapis.com/oauth2/v4/token";
		RestAssured.baseURI = "http://localhost:8080/";
	}
	@Test
	public void checkurl()
	{
		//given().get().then().statusCode(404);
		given().get("MVCLogin2/");
		//given.get("login");
	}
	@Test
	public void checklogin()
	{
		Login loginuser=new Login();
		loginuser.setUsername("bvsaniketh");
		loginuser.setPassword("bridgeitasdadsa");
		given().body(loginuser).post("login");
		
		
	}
}