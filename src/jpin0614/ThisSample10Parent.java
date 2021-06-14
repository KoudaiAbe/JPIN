package jpin0614;

class ThisSample10Parent {
	 // フィールド①
	 int instanceField = 123;
	 
	 // メソッド①
	 void methodOverride() {
	 System.out.println("Parent.methodOverride");
	 System.out.println("this is " + this);
	 System.out.println("this.instanceField is " + this.instanceField);
	 }
	 
	 void methodOfSuperClass() {
	 System.out.println("Parent.methodOfSuperClass");
	 System.out.println("this is " + this); // ここでのthisは何か?
	 System.out.println("this.instanceField is " + this.instanceField); // フィールド①と②のどちらか?
	 this.methodOverride(); // メソッド①と②のどちらが呼ばれるか?
	 // this.methodOfSubclass(); // メソッド③はここから呼び出せるか?
	 }
}
	 
class ThisSample10Child extends ThisSample10Parent {
	 // フィールド②
	 int instanceField = 456;
	 
	 // メソッド②
	 void methodOverride() {
	 System.out.println("Child.methodOverride");
	 System.out.println("this is " + this);
	 System.out.println("this.instanceField is " + this.instanceField);
	 }
	 
	 // メソッド③
	 void methodOfSubclass() {
	 System.out.println("Child.methodOfSubclass");
	 }
	 
	 public static void main(String[] args) {
	 ThisSample10Child sample = new ThisSample10Child();
	 sample.methodOfSuperClass();
	 }
}

