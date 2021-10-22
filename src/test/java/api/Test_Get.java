package api;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_Get {

	
	@Test
	public void test_Get() {
		
		
	        Response rs=get("https://reqres.in/api/users?page=2");
	        
	        
	        System.out.println(rs.getStatusCode());
	        System.out.println(rs.asString());
	        System.out.println(rs.getBody().asString());
	        System.out.println(rs.getTime());
	        System.out.println(rs.getStatusLine());
	        System.out.println(rs.getHeader("Content-type"));
	        
	        int statuscode=rs.getStatusCode();
	        Assert.assertEquals(statuscode, 201);
		
		
		
	}
	
	@Test
	public void test_1() {
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[3]", equalTo(10));
	}
	
	
	
	
}
