package jpin07072;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Sample {
	public static void main(String[] args) throws ParseException {

//		Set<String> set = new HashSet<>();
//
//		System.out.println(set.add("A"));
//		System.out.println(set.add("B"));
//		System.out.println(set.add("C"));
//		System.out.println(set.add("A"));
//
//		//重複が無い
//		for(String str : set) {
//			System.out.println(str);
//		}


//		Set<Item> set = new HashSet<Item>();
//		set.add(new Item("apple",100));
//		set.add(new Item("banana",200));
//		set.add(new Item("orange",300));
//
//		System.out.println(set.size());

//		Map<Integer,String> map = new HashMap<>();
//		map.put(1,"one");
//		map.put(2,"two");
//		map.put(3,"three");
//
////		System.out.println(map.get(1));
//
//		Set<Integer> keys = map.keySet();
//		for(Integer key : keys) {
//			System.out.println(map.get(keys));
//		}

//		Date date = new Date();
//		System.out.println(date.getTime());

		Calendar cal = Calendar.getInstance();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = cal.getTime();
		String str = formatter.format(date);
		System.out.println(str);

//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH) + 1);
//		System.out.println(cal.get(Calendar.DATE));

//		DateFormat formatter = DateFormat.getDateInstance();
//		System.out.println(formatter.format(cal.getTime()));


		formatter.setLenient(true);
		Date tmp = formatter.parse("2021-01-99");
		cal.setTime(tmp);

		cal.add(Calendar.YEAR,1);
		cal.add(Calendar.MONTH,1);
		System.out.println(formatter.format(cal.getTime()));

	}
}