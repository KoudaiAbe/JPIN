package javasilver5;

public class Main {
	public static void main(String[] args) {
		try {
			int[] array = {};
			array[0] = 10;
			System.out.println("finish");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("error");
		}
	}
}
