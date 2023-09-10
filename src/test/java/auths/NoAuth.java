package auths;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class NoAuth {

	
	
	@Test
	public void getcall() {
		
		given()
		
		.when().get("https://reqres.in/api/users?page=2")
		
		.then().statusCode(200).log().all();
		
	}
	@Test
	public void postcall() {
		
		HashMap payload=new HashMap();
		payload.put("name", "Shivani");
		payload.put("job", "QA");
		given().contentType("application/json").body(payload).when().post("https://reqres.in/api/users")
		
		
		.then().statusCode(201).log().all();
		
		
	}
	@Test
	public void putcall() {
		
	HashMap payload=new HashMap();
	payload.put("name", "Shivani");
	payload.put("job","QA" );
	given().contentType("application/json").body(payload).when().put("https://reqres.in/api/users/2")
	
	.then().statusCode(200).log().all();
		
		
		
	}
}

