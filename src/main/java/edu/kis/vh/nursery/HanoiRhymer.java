package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private final static int INITAL_REJECTED = 0;
	private int totalRejected = getInitalRejected();

	public static int getInitalRejected() {
		return INITAL_REJECTED;
	}

	public int getRejected() {
		return getTotalRejected();
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > getNumber())
			setTotalRejected(getTotalRejected() + 1);
		else
			super.countIn(in);
	}

	public int getTotalRejected() {
		return totalRejected;
	}

	public void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
