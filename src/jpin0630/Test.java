package jpin0630;

//「T」はTypeのT
//「E」はElementのE
public class Test<T> {


	private T value;

	public Test(int i) {
	}

	public Test(String string) {
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}



}
