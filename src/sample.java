
public class sample {
	public static void main(String[] args){
		
//		int i = 0;
//		
////		条件分岐に入る前に判定する
////		while(i < 5) {
////			System.out.println("hello");
////			i++;
////		}
////		最低一回実行する、条件の判定が実行後に判定される		
//		do {
//			System.out.println("hello");
//		}while(i < 5);
		
		
		int i = 0;
		
		while(true) {
			i++;
			if (i == 3) {
				continue;
			}
			System.out.println(i);
	
			if(5 < i) {
				break;
			}
		}		
	}
}
