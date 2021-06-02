package jpin0602;

public class Sample {
	public static void main(String[] args) {

//		Item a = new Item("apple",100);
//		Item b = new Item("apple",100);
//
//		//異なる参照を持っているのでfalse
////		System.out.println(a == b);
//
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//
//	}
//
//
//	public static void test(int... array) {
//		for (int n : array) {
//			System.out.println(n);
//		}

		try{
			int[] array = null;
			array[3] = 10;
		}catch(NullPointerException | ArrayIndexOutOfBoundsException e){
			System.out.println("error");
		}

		System.out.println("fin");

	}

}
