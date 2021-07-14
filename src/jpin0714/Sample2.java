package jpin0714;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Sample2 {
	public static void main(String[] args) throws Exception {

//		FileReader in = new FileReader("Sample.txt");
//		BufferedReader br = new BufferedReader(in);
//
//		String line = null;
//		while((line = br.readLine()) != null) {
//
//		}
//
////		int i = 0;
////
////		while((i = in.read()) != -1) {
////
////			char c = (char) i;
////			System.out.println(c);
////		}
//		in.close();


//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		FileWriter fw = new FileWriter("sample.txt");
		BufferedWriter out = new BufferedWriter(fw);

		try(br;out){
			String line = null;
			while((line = br.readLine()).equals("exit") == false) {
//				System.out.println(line);
				out.write(line);
				out.newLine();
			}
		}

		out.flush();
	}
}
