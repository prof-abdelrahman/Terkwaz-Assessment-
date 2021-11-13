package apitesting.terkwazapitesting;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;


public class RandomCatFact {
	
	@Test(description = "get one random cat fact and Check that the respons \"text\" is not empty")
	public static void getOneRandomCatFact(){
		given().contentType("JSON").when().get("https://alexwohlbruck.github.io/cat-facts/").then().assertThat().statusCode(200).body("text", notNullValue()).log().body(); 
		}
}
