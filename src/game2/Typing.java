package game2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Typing {

	Word w = new Word();

	//ゲーム全体メソッド
	public void typingGame() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.println("> " + "【"+w.getWord()+"】");
			w.setWord();
			String str = br.readLine();
			System.out.println(str);
		}
	}
}