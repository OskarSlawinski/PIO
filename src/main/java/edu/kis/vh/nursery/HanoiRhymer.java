package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int getRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > getNumber())
			totalRejected++;
		else
			super.countIn(in);
	}
}
