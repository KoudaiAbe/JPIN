
public class Main {
	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		for(int i = 0;i < 3;i++) {
			System.out.println(stack.pop());
		}
	}
}
