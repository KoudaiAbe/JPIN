package typing_game;

import java.util.ArrayList;
import java.util.List;

public class TypingProblem {

		private List<String> problem = new ArrayList<>();

		public TypingProblem() {
			super();
		}

		public void add(String str) {
			this.problem.add(str);
		}

		public String getProblem(int i) {
			return problem.get(i);
		}
}
