package jpin07072;

import java.util.HashSet;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {

//		Set<String> set = new HashSet<>();
//
//		System.out.println(set.add("A"));
//		System.out.println(set.add("B"));
//		System.out.println(set.add("C"));
//		System.out.println(set.add("A"));
//
//		//重複が無い
//		for(String str : set) {
//			System.out.println(str);
//		}


		Set<Item> set = new HashSet<Item>();
		set.add(new Item("apple",100));
		set.add(new Item("banana",200));
		set.add(new Item("orange",300));

		System.out.println(set.size());

	}
}
