package com.sample2;

public interface Sample {
	//publicが省略されている、書かなくても問題ない
	void hello();
	
	public static Sample create() {
		return new SampleImpl();
	}
}
