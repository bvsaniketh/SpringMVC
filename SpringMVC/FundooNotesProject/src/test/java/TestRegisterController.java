import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.bridgeit.Model.Register;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class TestRegisterController {

	static Register user1;
	static Register user2;
	Register user3;
	Register user4;
	Logger logger=Logger.getLogger(TestRegisterController.class);
	@BeforeClass
	public static void  setup()
	{
		RestAssured.baseURI="http://localhost";
		RestAssured.port=8080;
		RestAssured.basePath="/FundooNote";
		
		user1=new Register();
		user1.setName("Aniketh");
		user1.setEmail("bvsaniketh95@gmail.com");
		user1.setAge(25);
		user1.setMobile(472342);
		user1.setUsername("subbu");
		user1.setPassword("subbu");
		
		user2=new Register();
		user2.setName("Luis Suarez");
		user2.setEmail("robo@gmail.com");
		user2.setAge(25);
		user2.setMobile(472342);
		user2.setUsername("luis");
		user2.setPassword("suarez");
		
	}
	
	@Test
	@Ignore
	public void testRegister() {
		//String jsonString =user1.toJSONString;
		System.out.println("testRegister");
		given().contentType(ContentType.JSON).body(user1).when().post("/register").then().statusCode(404);
	}
	
	@Test
	public void testInsertRegister()
	{
		logger.info("insert user");
		given().contentType(ContentType.JSON).body(user2).post("register").then().statusCode(200);
	}
	
}
