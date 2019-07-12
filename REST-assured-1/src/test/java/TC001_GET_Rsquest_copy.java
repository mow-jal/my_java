
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;


public class TC001_GET_Rsquest_copy {

	@Test
	public void test() throws JSONException {
		
		//Option 1- directly from rest-assured
//		String uri = "http://restapi.demoqa.com/utilities/weather/city";
//		get(uri + "/lansdale").then().body("City", equalTo("Lansdale"));
//		
//		
//		Response response = get(uri + "/lansdale").then().extract().response();
//		System.out.println(response.asString());
//		System.out.println(response.asString().contains("Lansdale"));
//		System.out.println(response.asString().matches("[0-9\\.]{3,} Degree"));
//		
//		JsonPath.from(response.asString()).getString("City");
		
		//respponse.asString();
		
		String response1 = 		   
				"{" +
				"	\"lotto\":{" +
				"	 \"lottoId\":5," +
				"	 \"winning-numbers\":[2,45,34,23,7,5,3]," +
				"	 \"winners\":[{" +
				"	   \"winnerId\":23," +
				"	   \"numbers\":[2,45,34,23,3,5]" +
				"	 },{" +
				"	   \"winnerId\":54," +
				"	   \"numbers\":[52,3,12,11,18,22]" +
				"	 }]" +
				"	}" +
				"}";
		
//		System.out.println(JsonPath.from(response).getInt("lotto.winners[0].winnerId"));
//		System.out.println(JsonPath.from(response).getList("lotto.winners[0].numbers").size());
//		System.out.println(JsonPath.from(response).getList("lotto.winners[0].numbers").get(5));
		
		String response2 = 		   
				"{" +
				"	\"lotto\":{" +
				"	 \"lottoId\":6," +
				"	 \"winning-numbers\":[2,45,34,23,7,5,3]," +
				"	 \"winners\":[" +
					"{" +
					"	   \"winnerId\":54," +
					"	   \"numbers\":[52,3,12,11,18,22]" +
					"	 }," +
				"{" +
				"	   \"winnerId\":23," +
				"	   \"numbers\":[2,45,34,23,3,5]" +
				"	 }]" +
				"	}" +
				"}";		
		
			JSONAssert.assertEquals(response1, response2, JSONCompareMode.NON_EXTENSIBLE);

		
	}
	
//	
//	public void getWeatherDetails() {
//		//Specify Base URI
//		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
//		
//		//Request object
//		RequestSpecification request = RestAssured.given();
//		
////		RestAssured.given()
//		
//		//Response object
//		Response response = request.request(Method.GET, "Hyderabad");
//		
//		//Print response in consul window
//		String responseBody = response.getBody().asString();
//		System.out.println("Response body is: "+responseBody);
//		
//		//Status code validations
//		int statusCode = response.getStatusCode();
//		System.out.println("Status code: "+statusCode);
//		Assert.assertEquals(statusCode, 200);
//		
//		//Status line verification
//		String statusLine = response.statusLine();
//		System.out.println("Status line: "+statusLine);
//		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
//	}
	
	
}
