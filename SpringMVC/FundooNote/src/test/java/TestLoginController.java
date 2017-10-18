import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.bridgeit.Model.Login;
import com.bridgeit.Model.Note;
import com.bridgeit.Model.Register;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.util.Date;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestLoginController {

	static Login user1;
	static Login user2;
	static Login user3;
	static Register reg1,reg2,reg3,reg4,reg5;
	static Note note1,note2,note3,note4,note5;
	Logger logger = Logger.getLogger(TestRegisterController.class);

	@BeforeClass
	public static void setup() {

		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/FundooNote";

		user1 = new Login();
		user1.setEmail("bvsaniketh95@gmail.com");
		user1.setPassword("bridgeit");

		user2 = new Login();
		user2.setEmail("robo@gmail.com");
		user2.setPassword("suarez");

		user3 = new Login();
		user3.setEmail("bmsbharathi@gmail.com");
		user3.setPassword("bms");
		
		
		note1=new Note();
		reg1=new Register();
		reg1.setUser_id(5);
		note1.setTitle("Football");
		note1.setDescription("A beautiful game in peace");
		note1.setLastaccessdate(new Date());
		note1.setUser(reg1);
		
		note2=new Note();
/*		reg2=new Register();
		reg2.setUser_id(4);*/
		note2.setTitle("Criket");
		note2.setDescription("A bat and ball game in a ground");
		note2.setNotes_id(26);
		//note2.setUser(reg2);
		
		note3=new Note();
		reg3=new Register();
		reg3.setUser_id(4);
		note3.setNotes_id(26);
		note3.setUser(reg3);
		
		note4=new Note();
		note4.setNotes_id(8);
		
		note5=new Note();
		reg4=new Register();
		reg4.setUser_id(4);
		note5.setUser(reg4);
		
	}

	@Test
	@Ignore
	public void testLogin() {
		// String jsonString =user1.toJSONString;
		
		System.out.println("testRegister user exists");
		Response resp = given().contentType("application/json").body(user1).when()
				.post("fundoologin");
		logger.info(resp.asString());
		resp.then().statusCode(200);
	}
	@Test
    
	public void testLogin1() {
		// String jsonString =user1.toJSONString;
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjM0NSIsImlhdCI6MTUwNzgwMzk5MSwic3ViIjoiSldUIFRva2VuIiwiaXNzIjoiQW5pa2V0aCdzIFRva2VucyIsIk5hbWUiOiJBbmlrZXRoIEJvbmRhZGEiLCJNb2JpbGUiOjEyMzQ1LCJJZCI6MSwiZXhwIjoxNTA3ODA3OTkxfQ.6-nw_nQm5vjIolZwAZfu-P-ZtzNYW9uwc0BBVcLowiQ";
		System.out.println("testRegister user exists");
		Response resp = given().contentType("application/json").header("token", token).body(user1).when()
				.post("auth/insertNote");
		logger.info(resp.asString());
		resp.then().statusCode(200);
	}
	
	@Test
	@Ignore
	public void testFilter1() {
		// String jsonString =user1.toJSONString;
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjM0NSIsInN1YiI6IkpXVCBUb2tlbiIsImlzcyI6IkFuaWtldGgncyBUb2tlbnMiLCJOYW1lIjoiQmhhcmF0aGkiLCJNb2JpbGUiOjczNzMsIklkIjoyfQ.99TE3zxvrU4fistZ5_JWcVZO71dqxPW6v4RgJbAD2q0";
		System.out.println("Testing Notes Functionalities");
		/*Response resp = */given().contentType("application/json").header("token", token).body(note1).when()
				.post("auth/insertNote").then().statusCode(200);
		/*logger.info(resp.asString());*/
		
	}
	
	@Test
	@Ignore
	public void testFilter2() {
		// String jsonString =user1.toJSONString;
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjM0NSIsInN1YiI6IkpXVCBUb2tlbiIsImlzcyI6IkFuaWtldGgncyBUb2tlbnMiLCJOYW1lIjoiQmhhcmF0aGkiLCJNb2JpbGUiOjczNzMsIklkIjoyfQ.99TE3zxvrU4fistZ5_JWcVZO71dqxPW6v4RgJbAD2q0";
		System.out.println("Testing Notes Functionalities");
		/*Response resp = */given().contentType("application/json").header("token", token).body(note2).when()
				.post("auth/updateNote").then().statusCode(200);
		/*logger.info(resp.asString());*/
		
	}
	
	@Test
	@Ignore
	public void testFilter3() {
		// String jsonString =user1.toJSONString;
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjM0NSIsInN1YiI6IkpXVCBUb2tlbiIsImlzcyI6IkFuaWtldGgncyBUb2tlbnMiLCJOYW1lIjoiQmhhcmF0aGkiLCJNb2JpbGUiOjczNzMsIklkIjoyfQ.99TE3zxvrU4fistZ5_JWcVZO71dqxPW6v4RgJbAD2q0";
		System.out.println("Testing Notes Functionalities");
		/*Response resp = */given().contentType("application/json").header("token", token).body(note3).when()
				.post("auth/deleteNote").then().statusCode(200);
		/*logger.info(resp.asString());*/
		
	}
	
	@Test
	@Ignore
	public void testFilter4() {
		// String jsonString =user1.toJSONString;
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjM0NSIsInN1YiI6IkpXVCBUb2tlbiIsImlzcyI6IkFuaWtldGgncyBUb2tlbnMiLCJOYW1lIjoiQmhhcmF0aGkiLCJNb2JpbGUiOjczNzMsIklkIjoyfQ.99TE3zxvrU4fistZ5_JWcVZO71dqxPW6v4RgJbAD2q0";
		System.out.println("Testing Notes Functionalities");
		/*Response resp = */given().contentType("application/json").header("token", token).body(note4).when()
				.post("auth/getNotebyId").then().statusCode(200);
		/*logger.info(resp.asString());*/

	}
	
	@Test
	@Ignore
	public void testFilter5() {
		// String jsonString =user1.toJSONString;
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjM0NSIsInN1YiI6IkpXVCBUb2tlbiIsImlzcyI6IkFuaWtldGgncyBUb2tlbnMiLCJOYW1lIjoiQmhhcmF0aGkiLCJNb2JpbGUiOjczNzMsIklkIjoyfQ.99TE3zxvrU4fistZ5_JWcVZO71dqxPW6v4RgJbAD2q0";
		System.out.println("Testing Notes Functionalities");
		/*Response resp = */given().contentType("application/json").header("token", token).body(note5).when()
				.post("auth/selectAllNotes").then().statusCode(200);
		/*logger.info(resp.asString());*/

	}
	

}
