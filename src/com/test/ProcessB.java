package com.test;

final class ProcessB extends AbstractChain{

	public ProcessB(Type type) {
		super(Type.B);
		
	}

	@Override
	protected void perform(Task task) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("B:" + task.getValue());
	}
	
	
}
