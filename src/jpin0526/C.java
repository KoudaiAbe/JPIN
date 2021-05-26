package jpin0526;

public class C extends B {
	@Override
	public void hello() {
		//前処理
		System.out.println("Hello,BB");

		super.hello();

		//後処理
		System.out.println("GoodBye BBB");
	}
}
