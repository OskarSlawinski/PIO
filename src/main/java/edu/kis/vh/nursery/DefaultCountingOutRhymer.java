package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final static int NUMBERS_COUNT = 12;
	private final static int TOTAL_NUMBER = -1;

	private final int[] numbers = new int[getNumbersCount()];

	public static int getNumbersCount() {
		return NUMBERS_COUNT;
	}

	public static int getTotalNumber() {
		return TOTAL_NUMBER;
	}

	public int getTotal() {
		return total;
	}

	private int total = getTotalNumber();

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == getTotalNumber();
	}
		
	public boolean isFull() {
		return total == getNumbersCount() -1;
	}
		
	protected int getNumber() {
		if (callCheck())
			return getTotalNumber();
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return getTotalNumber();
		return numbers[total--];
	}

}
