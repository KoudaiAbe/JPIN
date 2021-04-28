
public class sample {
	public static void main(String[] args) {

		Item item = new Item();

		//カプセル化した状態
		item.setName("abc");
		item.setPrice(100);

		System.out.println(item.getName());

		//カプセル化してない状態
//		item.name = "ABC";
//		item.price  = 100;

//		System.out.println(item.name);


	}
}
