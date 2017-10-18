import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.HttpStatus;

import com.bridgelabz.note.model.Login;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class TestLoginController {

	private static Login login1, login2, login3, login4, login5;
	private static Logger logger = Logger.getLogger(TestLoginController.class);

	@BeforeClass
	public static void setUp() {

		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/fundooNote";
		logger.info("setup()");

		// this user created for testing for successful entry into database
		login1 = new Login();
		login1.setEmail("g28vaishali@gmail.com");
		login1.setPassword("Bavita@@123");

		login2 = new Login();
		login2.setEmail("dimitra.debnath@gmail.com");
		login2.setPassword(" ");

		login3 = new Login();
		login3.setEmail("vaishaligupta028@gmail.com");
		login3.setPassword("Vaishali##123");
		
		login4 = new Login();
		login4.setEmail("g28vaishali@gmail.com");
		login4.setPassword("Bavita@@123");
		login4.setConfirmPassword("Bavita@@123");
		
		login5 = new Login();
		login5.setEmail("g28vaishali@gmail.com");
		login5.setPassword("Bavita@@143");
		login5.setConfirmPassword("Bavita@@143");
	}

	@Test
	@Ignore
	public void test() {
		logger.info("test test-----");
		when().get("test");
	}

	@Test
	@Ignore
	public void loginUserWithoutAnyError() {
		logger.info("loginUserWithoutAnyError");
		given().contentType(ContentType.JSON).body(login1).when().post("/login").then().statusCode(200);
	}

	@Test
	@Ignore
	public void loginUserWithValidationError() {
		logger.info("loginUserWithValidationError");
		given().contentType(ContentType.JSON).body(login2).when().post("/login").then().statusCode(409);
	}

	@Test
	@Ignore
	public void loginUserWithUserNotFoundError() {
		logger.info("loginUserWithUserNotFoundError");
		given().contentType(ContentType.JSON).body(login3).when().post("/login").then().statusCode(404);
	}

	@Test
	@Ignore
	public void testlogoutUser() {
		logger.info("testlogoutUser");
		when().post("/logout").then().statusCode(202);
	}

	@Test
	@Ignore
	public void testForgotPassword() {
		logger.info("testForgotPassword");
		when().post("/forgotPassword").then().statusCode(200);
	}

	@Test
	@Ignore
	public void testSendOTPWithUserNotFound() {
		logger.info("testSendOTPWithUserNotFound");
		given().contentType(ContentType.JSON).body(login3).when().post("/sendOTP").then().statusCode(404);
	}

	@Test
	@Ignore
	public void testSendOTPWithOTPSuccess() {
		logger.info("testSendOTPWithOTPSuccess");
		given().contentType(ContentType.JSON).body(login1).when().post("/sendOTP").then().statusCode(202);
	}

	@Test
	@Ignore
	public void testResetWithOTPNotMatchingError() {
		logger.info("testResetWithOTPNotMatchingError");
		given().param("OTP", 615771).param("formOTP", 615771).when().get("/reset").then().statusCode(200);
	}

	@Test
	@Ignore
	public void testResendOTPWithOTPReceivedMessage() {
		logger.info("testResendOTPWithOTPReceivedMessage");
		when().get("/resendOTP").then().statusCode(202);
	}

	@Test
	@Ignore
	public void testChangePasswordWithValidationErrors() {
		logger.info("testChangePasswordWithValidationErrors");
		given().contentType(ContentType.JSON).body(login5).when().post("/changePass").then().statusCode(409);
	}

	@Test
	@Ignore
	public void testChangePasswordSuccessfully() {
		logger.info("testChangePasswordSuccessfully");
		given().contentType(ContentType.JSON).body(login5).when().post("/changePass").then().statusCode(200);
	}
}