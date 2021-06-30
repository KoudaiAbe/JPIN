package jpin0630;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("> ");
		String str = br.readLine();
		System.out.println(str);
		
//		Test<String> a = new Test<String>("hello");
//		Test<Integer> b = new Test<Integer>(10);
//
//		String str = a.getValue();
//		int i = b.getValue();
//
//		Integer a = Integer.valueOf(-128);
//		Integer b = Integer.valueOf(-128);
//
//		System.out.println(a == b);

		//コレクションについて
//		List<Integer> list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add(30);

//		list.remove(2);

//		for(int i = 0;i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}

		//
//		for (Object obj : list) {
//			Integer v = (Integer)obj;
//			System.out.println(v);
//		}

}

		private static void printAll(List<Integer> list) {

			Iterator<Integer> ite = list.iterator();

			while(ite.hasNext()) {
				int i = ite.next();
				System.out.println(i);
			}

			for(Integer i : list) {
				System.out.println(i);
			}

		}
}
