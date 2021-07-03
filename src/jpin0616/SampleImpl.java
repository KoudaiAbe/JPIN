package jpin0616;

//インターフェースを実現するクラスには通例でImplをつける
public class SampleImpl implements Sample {

	@Override
	public void hello() {
		System.out.println("hello.");
	}
}
