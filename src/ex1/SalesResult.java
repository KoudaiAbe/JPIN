package ex1;

import java.util.Date;

public class SalesResult {
	public static void main(String[] args) {
		Date date= new Date();

		int tokyo = 65000;
		int osaka = 73000;
		int nagoya = 90000;

		int sum;
		int avg;

		sum = tokyo + osaka + nagoya;
		avg = sum / 3;

		System.out.println("**" + date.toString() + "**");
		System.out.println("合計:" + sum);
		System.out.println("平均:" + avg);

	}
}
