package jpin0512;

public class Order {

	private Item item;
	private int qty;

	public void setItem(Item item) {
		this.item = item;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getTotal() {
		return this.item.getPrice() * qty;
	}

}
