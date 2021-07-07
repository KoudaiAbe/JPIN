package jpin0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TypingGame {
	public static void main(String[] args) throws Exception {

		try(BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in))){

			Examination ex = new Examination();

			//		for(Question q : ex) {
			//			System.out.println(q.getWord());
			//		}

			while(ex.hasNext()) {
				Question q = ex.next();
				System.out.println(q.getWord() + " > ");

				String answer = br.readLine();
				q.test(answer);

			}
		}
	}
}
