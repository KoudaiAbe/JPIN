
public class sample {
	
	public static int test(int num) {
		num = num * 2;
		return num;
		//System.out.println(num);//200
	}
	
	
	public static void main(String[] args) {
//		int num = 100;
//		int result = test(num);
//		System.out.println(num);//100
//		System.out.println(result);//200
		
		String str = "100";
		int result = Integer.parseInt(str);
		System.out.println(result * 5);//500
	}
	
	//	public static void main(String[] args){
//		
////		int i = 0;
////		
//////		条件分岐に入る前に判定する
//////		while(i < 5) {
//////			System.out.println("hello");
//////			i++;
//////		}
//////		最低一回実行する、条件の判定が実行後に判定される		
////		do {
////			System.out.println("hello");
////		}while(i < 5);
//		
////		
////		int i = 0;
////		
////		while(true) {
////			i++;
////			if (i == 3) {
////				continue;
////			}
////			System.out.println(i);
////	
////			if(5 < i) {
////				break;
////			}
////		}		
//		
//		
////		int[] array = new int[3];
////		array[0] = 10;
////		array[1] = 3;
////		array[2] = 5;
//		
////		int[] array = {10,20,30,40,-50,8,10,11};
//		
////		for(int i = 0;i < array.length;i++) {
////			System.out.println(array[i]);
////		}
//		
////		for(int num : array) {
////			System.out.println(num);
////			
////		}
//		
////		while(array.length < 10) {
////			System.out.println(array);
////			break;
////		}
//		
//		
//		
//		
//	}
}
