package jpin0707;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Dictionary {

	private List<String> list = new ArrayList<>();

	public Dictionary() throws Exception {
		this.init();
	}

	public void init() throws Exception {

		try( BufferedReader br = new BufferedReader(new FileReader("wordlist.txt"))){

			String line = null;
			while((line = br.readLine()) != null) {
				list.add(line);
			}

		}
	}


	public void shuffle() {

//		int r=  new Random().nextInt();
		int r=  Math.abs(new Random().nextInt(100));

		for(int i=0;i<r;i++) {
			Collections.shuffle(list);
		}
	}


	public String get(int index) {
		if(index < 0 || this.list.size() <= index) {
			throw new IllegalArgumentException("不正な入力です");
		}
		return this.list.get(index);
	}


	public int size() {
		return this.list.size();
	}

}
