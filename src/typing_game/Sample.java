package typing_game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		TypingProblem problem = new TypingProblem();
		problem.add("abc");
		problem.add("def");
		problem.add("ghi");

		for(int i = 0; i < 6;i++) {
			System.out.println(problem.getProblem(i));
			System.out.println("> ");

			String str = br.readLine();

			if(problem.getProblem(i).equals(str)) {

			}else {
				continue;
			}
		}
//		while(true) {
//			System.out.println("> ");
//			String str = br.readLine();
//			System.out.println(str);
//		}
	}
}
