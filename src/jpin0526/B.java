package jpin0526;

public class B extends A {
	//↓アノテーション
	@Override
	public void hello() {
		//前処理
		System.out.println("Hello,B");

		super.hello();

		//後処理
		System.out.println("GoodBye B");
	}

//	public B(String val) {
//		//暗黙的にsuperが入るよ
//		super(val);
//		System.out.println("B");
//	}
//	private int num;
//	public int getNum() {
//		return this.num;
//	}
}
