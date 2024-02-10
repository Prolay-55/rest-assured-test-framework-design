package apiTestFeb;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;



public class day1 {
	//@SuppressWarnings({"unchecked", "deprecation"})
	@Test
	void test_feb4() {
		
		Response res=given()
				//.contentType(contentType.json)
		
		
		.when()
		.get("https://reqres.in/api/users?page=2");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		System.out.println(res.getStatusCode());
	}

}
