import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {

	@Test
	public void registerCustomerAPI() {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("FirstName", "JohnXYZ");
		requestParam.put("FirstName", "JohnXYZ");
		requestParam.put("UserName", "JohnXYZxyz");
		requestParam.put("Email", "JohnXYZ@gmail.com");
		
		request.header("Content-Type", "application/json");
		
		request.body(requestParam.toJSONString());
		
		Response response = request.request(Method.POST, "/register");
		
		String responseBody = response.getBody().asString();
		System.out.println("responseBody: "+responseBody);
		Assert.assertEquals(responseBody, 201);
		
		//Status line verification
//		String statusLine = response.statusLine();
//		System.out.println("Status line: "+statusLine);
//		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
	}
	
	
}
