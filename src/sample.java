
public class sample {
	public static void main(String[] args){
//		System.out.println("Hello JPIN2");
//		int num;
//		num = 10;
//		System.out.println(num);
		
		int a = 10;
		int b = a++ + ++a;

		//a++
		//int a = 11;
		//int b = 10 + ++a;
		
		//++a
		//int a = 11;
		//int b = 10 + 12;
		
//		System.out.println(b);//22
	
		String str1 = "Hi";
		String str2 = str1 + 100 + 100;
		String str3 = 100 + 100 + str1;
		
		System.out.println(str2);//Hi100100
		System.out.println(str3);//200Hi
	}
}
