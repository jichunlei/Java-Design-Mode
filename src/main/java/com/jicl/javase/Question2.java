package com.jicl.javase;

public class Question2 {
	public static void main(String[] args) {
		// 使用递归操作
		long start1 = System.currentTimeMillis();
		System.out.println("n=40>>>计算结果为：" + f1(45));
		long end1 = System.currentTimeMillis();
		System.out.println("使用递归的耗费时间：" + (end1 - start1));// 192ms

		// 使用递归操作
		long start2 = System.currentTimeMillis();
		System.out.println("n=40>>>计算结果为：" + f2(45));
		long end2 = System.currentTimeMillis();
		System.out.println("使用迭代的耗费时间：" + (end2 - start2));// <1ms
	}

	/**
	 * 斐波那契数列递归写法(效率低，但是代码精简)
	 * 
	 * @param n
	 * @return
	 */
	public static int f1(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("入参不能小于1，实际值为" + n);
		}
		if (n == 1 || n == 2) {
			return n;
		}
		return f1(n - 1) + f1(n - 2);
	}

	/**
	 * 斐波那契数列循环迭代写法(效率高，但代码较复杂)
	 * 
	 * @param n
	 * @return
	 */
	public static int f2(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("入参不能小于1，实际值为" + n);
		}
		if (n == 1 || n == 2) {
			return n;
		}
		int j = 1;// f(1)的值
		int k = 2;// f(2)的值
		int sum = 0;// 初始化结果
		for (int i = 3; i <= n; i++) {
			sum = j + k;
			j = k;// 往后传递
			k = sum;// 往后传递
		}
		return sum;
	}
}
