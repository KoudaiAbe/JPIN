package jpin0714;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) throws IOException {


//		File file = new File("sample.txt");
////		System.out.println(file.exists());
//
//		if(file.exists() == false) {
//			file.createNewFile();
//		}else {
//			file.delete();
//		}

//		File dir = new File("dir");
//		if(dir.exists()) {
//			dir.delete();
//		}else {
//			dir.mkdir();
//		}
//		System.out.println(dir.getAbsolutePath());


		File dir = new File(".");
		File[] files = dir.listFiles();

		for(File file : files) {
//			if(file.isFile() == true) {
//				files
//			}
			System.out.println(file.getAbsolutePath());
		}
	}


	private static void printAll(File dir,String indent) {

		File[] files = dir.listFiles(new JavaFileFilter());

		for(File file : files) {
			if(file.isDirectory()) {
				printAll(file,indent + " ");
			}
				System.out.println(indent + file.getName());
			}

	}

	private static class JavaFileFilter implements FileFilter{


		@Override
		public boolean accept(File file) {

			if(file.isDirectory()) {
				return true;
			}

			if(file.getName().endsWith(".java")) {
				return true;
			}

			return false;

		}
	}
}
