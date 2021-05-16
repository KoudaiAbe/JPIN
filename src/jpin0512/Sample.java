package jpin0512;

public class Sample {
	public static void main(String[] args) {

		Item apple = new Item();
		apple.setName("apple");
		apple.setPrice(100);

		Order order = new Order();
		order.setItem(apple);
		order.setQty(3);

		int result = order.getTotal();
		System.out.println(result);

	}
}
