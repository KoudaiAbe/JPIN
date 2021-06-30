package jpin0630;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {

		Test<String> a = new Test<String>("hello");
		Test<Integer> b = new Test<Integer>(10);

		String str = a.getValue();
		int i = b.getValue();

//		Integer a = Integer.valueOf(-128);
//		Integer b = Integer.valueOf(-128);
//
//		System.out.println(a == b);

		//コレクションについて
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);

//		list.remove(2);

//		for(int i = 0;i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		//
		for (Object obj : list) {
			Integer v = (Integer)obj;
			System.out.println(v);
		}


	}
}
