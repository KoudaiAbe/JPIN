package com.test;

final class ProcessA extends AbstractChain{

	public ProcessA() {
		super(Type.A);
	}


	@Override
	protected void perform(Task task) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("A:" + task.getValue());
		
	}
	

}
