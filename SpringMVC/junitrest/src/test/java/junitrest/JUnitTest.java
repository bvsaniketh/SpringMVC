/*
import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;
import org.junit.BeforeClass;

public class JUnitTest {

	@BeforeClass
	public static void init() {
		RestAssured.port = 8080;
		RestAssured.baseURI = "https://www.googleapis.com/oauth2/v4/token";
	}
	@Test
	public void checkurl()
	{
		given().get().then().statusCode(200);
	}
}*/