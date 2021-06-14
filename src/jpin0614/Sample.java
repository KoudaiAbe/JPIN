package jpin0614;

public class Sample {
	public static void main(String[] args) {
		//インスタンスの生成　Aクラス　変数bにBクラスを入れる
		A b = new B();
		b.hello();
	}

}


class A{
	void hello() {
		this.test();
	}

	void test() {
		System.out.println("test A");
	}
}


class B extends A{
	@Override
	void hello() {
		System.out.println("hello B");
		super.hello();
	}

	@Override
	void testtest() {
		System.out.println("test B");
	}
}


//実行結果
//hello B
//test B

