package jpin0602;

public class Main {
	public static void main(String[] args){

		String a = new String("hoge");
		String b = new String("hoge");

		//false
		System.out.println(a == b);
		//true
		System.out.println(a.equals(b));


		String c ="hoge";
		String d ="hoge";

		//true
		System.out.println(c == d);

		//true
		System.out.println(c.equals(d));

	}
}
