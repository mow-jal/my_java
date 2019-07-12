import org.apache.http.HttpRequest;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Rsquest {

	@Test
	public void getWeatherDetails() {
		//Specify Base URI
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		//Request object
		RequestSpecification request = RestAssured.given();
		
		//Response object
		Response response = request.request(Method.GET, "Hyderabad");
		
		//Print response in consul window
		String responseBody = response.getBody().asString();
		System.out.println("Response body is: "+responseBody);
		
		//Status code validations
		int statusCode = response.getStatusCode();
		System.out.println("Status code: "+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//Status line verification
		String statusLine = response.statusLine();
		System.out.println("Status line: "+statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}
	
	
}
