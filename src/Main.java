
public class Main {
	public static void main(String[] args) {

		Item item = new Item();
		item.setName("apple");
		item.setPrice(1000);

		Order order = new Order();
		order.setItem(item);
		order.setQty(3);

		int result = order.getTotal();
		System.out.println(result);

//		Stack stack = new Stack();
//		stack.push("A");
//		stack.push("B");
//		stack.push("C");
//
//		for(int i = 0;i < 3;i++) {
//			System.out.println(stack.pop());
//		}
	}
}
