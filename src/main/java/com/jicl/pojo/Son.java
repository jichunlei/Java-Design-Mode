package com.jicl.pojo;

/**
 * 子类
 * @author xianzilei
 *
 */
public class Son extends Father {
	private int i=test();
	private static int j=method();
	static {
		System.out.print("(6)");
	}
	Son(){
		//子类构造器一定有这句，写不写都是存在的
		//即子类一定会调用父类的构造器
		//super();
		System.out.print("(7)");
	}
	{
		System.out.print("(8)");
	}
	
	public int test() {
		System.out.print("(9)");
		return 1;
	}
	public static int method() {
		System.out.print("(10)");
		return 1;
	}
	
	//执行结果：
	//(5)(1)(10)(6)(9)(3)(2)(9)(8)(7)
	//(9)(3)(2)(9)(8)(7)
	public static void main(String[] args) {
		Son s1=new Son();
		System.out.println();
		Son s2=new Son();
	}
}
