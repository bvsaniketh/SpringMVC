import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.bridgelabz.note.model.User;
import org.apache.log4j.Logger;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestUserController {

	private static User user1, user2, user3, user4;
	private static Logger logger = Logger.getLogger(TestUserController.class);

	@BeforeClass
	public static void setUp() {

		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/fundooNote";
		logger.info("setup()");

		// this user created for testing for successful entry into database
		user1 = new User();
		user1.setFullName("Rajesh Chetrri");
		user1.setEmail("rajesh12@gmail.com");
		user1.setMobileNumber("9876521484");
		user1.setPassword("Rajesh##123");

		// this user created for testing the validation part
		user2 = new User();
		user2.setFullName("Seema Biswa");
		user2.setEmail(" ");
		user2.setMobileNumber("9735147824");
		user2.setPassword("seemapwd");

		// this user created for testing the user already exist part
		user3 = new User();
		user3.setFullName("Ramesh Chetrri");
		user3.setEmail("rajesh12@gmail.com");
		user3.setMobileNumber("9635786758");
		user3.setPassword("Ramesh##123");

		// this user created for testing the internal server part
		user4 = new User();
		user4.setFullName("Arjun Shirodi");
		user4.setEmail("arju12@gmail.com");
		user4.setMobileNumber("9576521844");
		user4.setPassword("Arju##312");
	}

	@Test
	
	public void insertUserWithoutAnyError() {
		logger.info("insertUserWithoutAnyError()");
		given().contentType(ContentType.JSON).body(user4).when().post("register").then().statusCode(200);
		// assertThat(resp.getStatus(),equalTo(1));
	}

	@Test
	@Ignore
	public void insertUserWithValidationError() {
		logger.info("insertUserWithValidationError()");
		Response resp = given().contentType(ContentType.JSON).body(user2).when().post("register");
		
		
		 System.out.println("-------------"+resp.asString()+"------");
	}

	@Test
	@Ignore
	public void insertUserWithUserAlreadyExistError() {
		logger.info("insertUserWithUserAlreadyExistError()");
		Response resp = given().contentType(ContentType.JSON).body(user3).when().post("register");
		
		System.out.println(resp.asString());
	/*	// assertThat(2, is(equalTo(2)));
		System.out.println(resp.asString());
		System.out.println("lkhjhswdhgfjkdhf");
		resp.then().body("status", Matchers.comparesEqualTo(-1)).body("msg", Matchers.anything(""));
		System.out.println(resp.statusCode());*/
	}

	@Test
	@Ignore
	public void insertUserWithInternalServerError() {
		logger.info("insertUserWithInternalServerError()");
		given().body(user4).when().post("register").then().statusCode(500);
	}

	@Test
	@Ignore
	public void test() {
		System.out.println("test2test");
		when().get("test2");
	}
}
