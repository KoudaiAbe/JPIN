package jpin0602;

public class Sample {
	public static void main(String[] args) {

		Item a = new Item("apple",100);
		Item b = new Item("apple",100);

		//異なる参照を持っているのでfalse
//		System.out.println(a == b);

		System.out.println(a.equals(b));

	}
}
