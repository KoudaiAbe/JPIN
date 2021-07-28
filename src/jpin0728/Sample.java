package jpin0728;

import java.util.List;

public class Sample {
	public static void main(String[] args) {

//		Sample s = new Sample();
//		Sample.Inner inner = s.new Inner();

//		Sample.Inner s = new Inner();
//		new ArrayList<>().iterator();

		List<Item> lsit = List.of(
				new Item("apple",100),
				new Item("orange",300),
				new Item("banana",200)
				);

		//上記は変更不可のリストなのでエラーになる
//		list.add(new Item("hoge",1000));

//	private static class Inner{

	}
}
