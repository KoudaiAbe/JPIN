package jpin0707;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Examination implements Iterator<Question> {

	private List<Question> questions = new ArrayList<>();
	private Dictionary dic;
	private Question current;
	private int index = 0;

	public Examination() {
		this(20);
	}

	public Examination(int size) {
		try {
			if (dic == null) {
				dic = new Dictionary();
			}
			dic.shuffle();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		for (int i = 0; i < size - 1; i++) {
			String word = dic.get(i);
			if (word == null) {
				break;
			}
			this.questions.add(new Question(word));
		}
	}

	@Override
	public boolean hasNext() {
		return this.index < this.questions.size() - 1;
	}

	@Override
	public Question next() {

		if (this.current == null) {
			this.current = this.questions.get(index);
		}

		if (this.current.isClear()) {
			index++;
			this.current = this.questions.get(index);
		}

		return current;
	}

}
