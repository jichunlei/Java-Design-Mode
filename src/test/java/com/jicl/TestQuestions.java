package com.jicl;

import org.junit.Test;
import com.jicl.design.Singleton1;
import com.jicl.design.Singleton2;
import com.jicl.design.Singleton3;
import com.jicl.pojo.Son;

public class TestQuestions {
	@Test
	public void testSingleton() {
		System.out.println("Singleton1:"+Singleton1.INSTANCE);
		System.out.println("Singleton2:"+Singleton2.INSTANCE);
		System.out.println("Singleton3:"+Singleton3.INSTANCE);
	}
}
