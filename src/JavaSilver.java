
public class JavaSilver {
	public static void main(String[] args) {
//		String str = "aaaa";
//		System.out.println(str.replace("aa", "b"));//bb
		
//		int val = 7;
//		boolean flg = true;
//		if(flg == true) {
//			do {
//				System.out.println(val);
//			}
//			while(val > 10);
//		}
//		
//		String str = "abcde";
//		System.out.println(str.charAt(str.length()));
		
//		int a = 10;
//		int b = a++ + a + a-- - a-- + ++a;
//		System.out.println(b);//32
		

//		boolean a = true;
//		boolean b = true;
//		System.out.println(a<=b);//boolean型で大なり小なりは使えない
//		System.out.println(a < b);
		
//		int a = 0;
//		while(a < 5);
//		
//		do
//			a++;//コンパイルエラー
//			System.out.println(a);
//		while(true);
		
//		for(int i = 0;long j = 2;i < 5;i++) {//違う型同士は処理出来ない
//			System.out.println(i * j);
//		}
		
//		//ラムダ式
//		Runnable runner = () ->{
//			System.out.println("hello");
//		};
//		runner.run();//hello
		
		
//		int cnt = 0;
//		Runnable r = () ->{
//			for(cnt = 0;cnt < 10;cnt++) {
//				//Local variable cnt defined in an enclosing scope must be final or effectively final
//				//コンパイルエラー,実質finalでないため
//				System.out.println(cnt);
//			}
//		};
//		new Thread(r).start();
//		
		//API
//		char a = '0';
//		int num = 0;
//		
//		if(Character.isAlphabetic(a)) {//アルファベットかどうか調べる
//			num++;
//		}
//		
//		if(Character.isDigit(a)) {//文字が数字がどうか調べる
//			num++;
//		}
//		
//		if(Character.isLowerCase(a)) {//大文字か小文字かを調べる
//			num++;
//		}
//		
//		System.out.println(num);
		
		//要素数を0にしているとハッシュコードを返すよ
		int [] array = new int[0];
		System.out.println(array);//[I@d716361
		
	}
}
