package test;

import java.util.List;

public class Winner {
	private int winnerId;
	private List<Integer> numbers;
	
	public Winner() {
		super();
	}

	public Winner(int winnerId, List<Integer> numbers) {
		super();
		this.winnerId = winnerId;
		this.numbers = numbers;
	}

	public int getWinnerId() {
		return winnerId;
	}

	public void setWinnerId(int winnerId) {
		this.winnerId = winnerId;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	
	
}
