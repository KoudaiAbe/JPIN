package jpin0609;

import com.Sample.A;
import com.Sample.Factory;

public class Sample {
	public static void main(String[] args) {

		A a = Factory.create();
		a.hello();

	}
}
