package com.test;

final class ProcessC extends AbstractChain{
	
	public ProcessC(Type type) {
		super(Type.C);
		
	}

	@Override
	protected void perform(Task task) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("C:" + task.getValue());
	}

}
