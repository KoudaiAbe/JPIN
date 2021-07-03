package com.test;

public interface Process {

	void execute(Task task);
	
	static Process getInstance() {
		
		AbstractChain a = new ProcessA();
		AbstractChain b = new ProcessB();
		AbstractChain c = new ProcessC();
		
		b.setNext(c);
		a.setNext(b);
		
		return a;
	}

}