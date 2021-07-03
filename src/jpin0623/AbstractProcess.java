package jpin0623;

public abstract class AbstractProcess {

	public void execute() {
		System.out.println("Start");
		peform();
		System.out.println("END");
	}
	
	protected abstract void peform();
	
}
