package jpin07072;

import java.text.ParseException;
import java.util.Calendar;

public class BirthDay {
	public static void main(String[] args) throws ParseException {

		Calendar birth = Calendar.getInstance();
		birth.set(1991,7,22);

		Calendar now = Calendar.getInstance();

		int count = 0;
		while(birth.before(now)) {
			count++;
			birth.add(Calendar.DATE, 1);
		}

		System.out.println(count);

	}
}
