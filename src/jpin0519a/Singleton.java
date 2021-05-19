package jpin0519a;

public class Singleton {
	private static Singleton instance;
	private String val;

	//外部からnewすることは出来ない
	private Singleton() {}

	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}


	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}

}
