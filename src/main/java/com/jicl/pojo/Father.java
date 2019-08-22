package com.jicl.pojo;

/**
 * 父类
 * @author xianzilei
 *
 */
public class Father {
	//实例变量赋值语句
	private int i=test();
	//静态变量赋值语句
	private static int j=method();
	//父类构造方法
	Father(){
		System.out.print("(2)");
	}
	//静态代码块
	static {
		System.out.print("(1)");
	}
	//非静态代码块
	{
		System.out.print("(3)");
	}
	//实例方法
	public int test() {
		System.out.print("(4)");
		return 1;
	}
	//静态方法
	public static int method() {
		System.out.print("(5)");
		return 1;
	}	
}