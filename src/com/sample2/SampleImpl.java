package com.sample2;

//インターフェースを実現するクラスには通例でImplをつける
class SampleImpl implements Sample {

	@Override
	public void hello() {
		System.out.println("hello.");
	}
}
