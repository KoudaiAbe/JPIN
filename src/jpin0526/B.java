package jpin0526;

public class B extends A {
	//↓アノテーション
	@Override
	public void hello() {
		//前処理
		System.out.println("Hello,B");

		//無くても問題なし、暗黙的に処理してくれる部分
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
