package com.test;

public class Main {
	public static void main(String[] args) {
		
		Process p = Process.getInstance();
		p.execute(new task(Type.A,"Hello"));
		
	}
}
