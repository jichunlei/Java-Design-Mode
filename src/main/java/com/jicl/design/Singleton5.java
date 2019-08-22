package com.jicl.design;

/**
 * @describe: 懒汉式：2）、多单线程环境下（线程安全）
 * @author: xianzilei
 * @date: 2019年8月21日
 */
public class Singleton5 {
	// 单例对象
	private static volatile Singleton5 instance;

	private Singleton5() {
	}

	/**
	 * 需要时候才创建
	 * 
	 * @return
	 */
	public static Singleton5 getInstance() {
		//双重判断，提供效率
		if (instance == null) {
			//使用同步锁
			synchronized (Singleton5.class) {
				if (instance == null) {
					instance = new Singleton5();
				}
			}
		}
		return instance;
	}
}