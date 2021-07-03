package com.sample3;

abstract class AbstractProcess implements Process {

	@Override
	public void execute() {
		System.out.println("Start");
		peform();
		System.out.println("END");
	}
	
	protected abstract void peform();
	
}
