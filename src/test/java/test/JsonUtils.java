package test;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

	@Test
	public void toJson() throws JsonProcessingException {
		
//		given().contentType("application/json").headers("channel","133","sdklfajf","adfs").body("sfds").post("dfd")
//		.then().log().all().extract().response();
		
		Lotto lotto = new Lotto();
		lotto.setLottoId(5);
		lotto.setWinning_numbers(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		
		Winner w1 = new Winner(1, Arrays.asList(1, 3, 5, 7, 9));
		Winner w2 = new Winner(2, Arrays.asList(2, 4, 6, 8, 0));
		lotto.setWinners(Arrays.asList(w1, w2));
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.USE_DEFAULTS);
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(lotto));
		
		
		Lotto lotto2 = new Lotto();
		lotto2.setLottoId(5);
		lotto2.setWinning_numbers(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		lotto2.setLottoId(6);
		lotto2.setWinning_numbers(Arrays.asList(6, 1, 2, 3, 4, 5, 6, 7));
		Winner w3 = new Winner(3, Arrays.asList(2, 4, 6, 8, 0));
		lotto.getWinners().add(w3);
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(lotto2));
		
	}
	
	
	
	
	
	
	
	
	
	public void fromJson() throws JsonParseException, JsonMappingException, IOException {
		String response1 = 		   
				"{" +
				"	\"lotto\":{" +
				"	 \"lottoId\":5," +
				"	 \"winning_numbers\":[2,45,34,23,7,5,3]," +
				"	 \"winners\":[{" +
				"	   \"winnerId\":23," +
				"	   \"numbers\":[2,45,34,23,3,5]" +
				"	 },{" +
				"	   \"winnerId\":54," +
				"	   \"numbers\":[52,3,12,11,18,22]" +
				"	 }]" +
				"	}" +
				"}";
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.USE_DEFAULTS);
		Lotto lotto = mapper.readValue(response1, Lotto.class);
		
		
		System.out.println(lotto.getLottoId());
		System.out.println(lotto.getWinning_numbers());
		
		
		
		
	}
	
	
	public void buildLotto(int lottoid, int winnerId) {
//		String response1 = 		   
//				"{" +
//				"	\"lotto\":{" +
//				"	 \"lottoId\":5"," +
//				"	 \"winning_numbers\":[2,45,34,23,7,5,3]," +
//				"	 \"winners\":[{" +
//				"	   \"winnerId\":23," +
//				"	   \"numbers\":[2,45,34,23,3,5]" +
//				"	 },{" +
//				"	   \"winnerId\":54," +
//				"	   \"numbers\":[52,3,12,11,18,22]" +
//				"	 }]" +
//				"	}" +
//				"}";
		
	}
	
}
