package test;

import java.util.List;

public class Lotto {
	private int lottoId;
	private List<Integer> winning_numbers;
	private List<Winner> winners;
	
	public Lotto(int lottoId, List<Integer> winning_numbers, List<Winner> winners) {
		super();
		this.lottoId = lottoId;
		this.winning_numbers = winning_numbers;
		this.winners = winners;
	}

	public Lotto() {
		super();
	}

	public int getLottoId() {
		return lottoId;
	}

	public void setLottoId(int lottoId) {
		this.lottoId = lottoId;
	}

	public List<Integer> getWinning_numbers() {
		return winning_numbers;
	}

	public void setWinning_numbers(List<Integer> winning_numbers) {
		this.winning_numbers = winning_numbers;
	}

	public List<Winner> getWinners() {
		return winners;
	}

	public void setWinners(List<Winner> winners) {
		this.winners = winners;
	}

	
	
}



//
//String response1 = 		   
//"{" +
//"	\"lotto\":{" +
//"	 \"lottoId\":5," +
//"	 \"winning-numbers\":[2,45,34,23,7,5,3]," +
//"	 \"winners\":[{" +
//"	   \"winnerId\":23," +
//"	   \"numbers\":[2,45,34,23,3,5]" +
//"	 },{" +
//"	   \"winnerId\":54," +
//"	   \"numbers\":[52,3,12,11,18,22]" +
//"	 }]" +
//"	}" +
//"}";