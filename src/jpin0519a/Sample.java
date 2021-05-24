package jpin0519a;

//アスタリスクよりも正確に記述をする
//import com.Sample.*;
import com.Sample.A;

public class Sample {
	public static void main(String[] args) {

//		com.Sample.A a = new com.Sample.A();
		A a = new A();
		System.out.println(a);

//		Singleton a = Singleton.getInstance();
//		Singleton b = Singleton.getInstance();
//
//		a.setVal("hello.");
//		System.out.println(b.getVal());


//		A.num = 10;
//		A.test();

		//呼びこまれたクラスを見れるよ
//		Class Clazz = A.class;
//		Method[] methods = Clazz.getDeclaredMethods();
//
//		for(Method m: methods) {
//			System.out.println(m.getName());
//		}
		//インスタンスを作らないと動かない
//		Sample sample = new Sample();
//		sample.hoge();

		//staticなら呼び出せる
//		hoge();
//	}
//
//	public static void hoge() {
////	public void hoge() {
//		System.out.println("hoge");
//	}
	}
}
