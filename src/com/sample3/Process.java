package com.sample3;

public interface Process {

	void execute();
	
	static Process getInstance() {
		return new SampleProcess();
	}
}