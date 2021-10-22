package api;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;




public class Test_Post {
	
	@Test
	public void Post() {
	
   Map<String,Object> map=new HashMap<String,Object>();


   map.put("name","rajan");
   map.put("age", 24);
   System.out.println(map);
   
   JSONObject request=new JSONObject();
   request.put("name","rajan");
   request.put("age", 24);
   
   System.out.println(request);
   System.out.println(request.toJSONString());
 
   given().body(request.toJSONString()).
   when().post("https://reqres.in/api/users").then().statusCode(201);
   
   
    
    
	}

}
