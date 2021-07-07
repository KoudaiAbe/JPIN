package jpin0707;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Examination implements Iterable<Question> {

	private List<Question> questions = new ArrayList<>();
	private Dictionary dic;
	private Question current;
	private int index = 0;


	public Examination() {
		this(20);
	}

	public Examination(int size) {
		try{
			if(dic == null) {
				dic = new Dictionary();
			}
			dic.shuffle();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}


		for(int i = 0;i < size - 1; i++) {
			String word = dic.get(i);
			if(word == null) {
				break;
			}
			this.questions.add(new Question(word));
		}
	}

	@Override
	public Iterator<Question> iterator(){
		return this.questions.iterator();
	}


	@Override
	public boolean hasNext() {

		if(this.questions.size() <= index) {
			return false;
		}

		return true;
	}

	@Override
	public Question next() {

		if(this.current == null) {
			this.current = this.questions.get(index);
		}

		if(this.current != null && this.current.isCleare()) {
			index++;
			this.current = this.questions.get(index);
		}

		return current;
	}
}
