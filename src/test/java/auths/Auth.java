package auths;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class Auth {
	
	
	@Test
	public void basicauth() {
	given().auth().basic("postman","password").when().get("https://postman-echo.com/basic-auth")
	.then().statusCode(200).log().all();
	

	
	
	}
	@Test
	public void BearerToken() {
		
		String Token="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";
		
	given().headers("Authorization", "Bearer "+Token).when().get("https://api.github.com/user/repos")
	.then().statusCode(200).log().all();
	
	
	
	}

}
