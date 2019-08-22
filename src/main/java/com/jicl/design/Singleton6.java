package com.jicl.design;

/**
 * @describe: 懒汉式：3）、静态内部类（线程安全）
 * @author: xianzilei
 * @date: 2019年8月21日
 */
public class Singleton6 {
	//构造方法私有化
	private Singleton6() {
	}
	
	//静态内部类不会随着外部类加载而加载
	private static class Inner{
		// 单例对象
		private static final Singleton6 INSTANCE=new Singleton6();
		
	}
	
	/**
	 * 需要时候才创建
	 * 
	 * @return
	 */
	public static Singleton6 getInstance() {
		return Inner.INSTANCE;
	}
}