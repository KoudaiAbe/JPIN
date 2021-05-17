package jpin0512;

public class Sample {
	public static void main(String[] args) {

		Item apple = new Item("apple",100);
//		apple.setName("apple");
//		apple.setPrice(100);

		Item banana = new Item("banana",80);
		Item orange = new Item("orange", 120);

//		Order order = new Order(apple,3);
//		order.setItem(apple);
//		order.setQty(3);

//		int result = order.getTotal();
//		System.out.println(result);

		ShoppingCart cart = new ShoppingCart();
		cart.add(new Order(apple, 3));
		cart.add(new Order(banana, 5));
		cart.add(new Order(orange, 2));

		int result = cart.getTotal();
		System.out.println(result);

	}
}
