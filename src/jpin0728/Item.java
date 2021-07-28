package jpin0728;

public class Item implements Comparable<Item>{

	private String name;
	private int price;



	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}



	@Override
	public int compareTo(Item o) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
