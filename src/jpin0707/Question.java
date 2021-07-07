package jpin0707;

public class Question {

	private String word;
	private int failCount = 0;
	private boolean clear;

	public Question(String word) {
		this.word = word;
	}


	public boolean test(String answer) {

		this.isCleare() = word.equals(answer);

		if(clear == false) {
			failCount++;
		}
		return clear;
	}


	public String getWord() {
		return word;
	}


	public int getFailCount() {
		return failCount;
	}

	public boolean isCleare() {
		return this.isCleare();
	}
}
