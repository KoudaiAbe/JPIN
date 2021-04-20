
public class Test {
	
	int num;//初期値は0
	void methodA(){
		int num = 2;
		methodB();
		System.out.println(num);
	}
	
	void methodB() {
		num = 3;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		
		int num = 1;
		
		System.out.println(test.num);//0
		test.methodA();//2
		System.out.println(num);//1
		System.out.println(test.num);//3
	}
}

