package com.test;

abstract class AbstractChain implements Process {
	
	private Type type;
	private Process next;
	
	public AbstractChain(Type type) {
		super();
		this.type = type;
	}
	
	@Override
	public void execute(Task task) {
		if(task.getType() == this.type) {
			perform(task);
			return;
		}
		if(this.next == null) {
			throw new IllegalStateException();
		}
		this.next.execute(task);
	}
	
	
	protected abstract void perform();
	
	public void setNext(Process next) {
		this.next = next;
	}


}
