package restFramework;

public class JsonRequestBuilder {

	public String addWallet() {
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
		return null;
	}
	
}
