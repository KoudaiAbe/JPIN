package jpin0602;

import java.util.Objects;

public class Item {
	private String name;
	private int price;

	public Item(String name,int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {

		if(obj == null) {
			return false;
		}

		//互換性がある型どうか判定
		if(obj instanceof Item == false) {
			return false;
		}

		Item target = (Item) obj;
		return this.name.equals(target.name);
	}

}
