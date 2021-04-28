
public class Stack {

	private String[] array = new String[10];
	private int index = 0;

	public void push(String val) {
		array[index] = val;
		index++;
	}

	public String pop() {
		index--;
		return array[index];

//		index初期化してるのに忘れてるね↓悲しいね
//		int x = array.length;
//		int n = 0;
//		return array[x - (n++ + 1)];
	}

}
