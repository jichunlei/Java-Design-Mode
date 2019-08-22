# Java面试题练习

### 1、局部变量表与操作数栈



### 2、单例模式

### 3、类初始化和实例初始化

* Father类（父类）

```java
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
```

* Son类（子类）

```java
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
    
    //判断执行结果
	public static void main(String[] args) {
		
	}
}
```



3.1 类初始化

1. 一个类要创建实例需要先加载并初始化该类
   * main方法所在的类需要先加载和初始化
2. 一个子类要初始化需要先初始化父类
3. 一个类初始化就是执行<clinit>()方法
   * <clinit>(）方法由静态类变量显示赋值代码和静态代码块组成
   * 类变量显示赋值代码和静态代码块代码**从上到下顺序执行**
   * <clinit>(）方法只执行一次

3.2 实例初始化

1. 实例初始化就是执行<init>()方法
   * <init>()方法可能重载多个，有几个构造器就有几个<init>()方法
   * <init>()方法由非静态实例变量显示赋值代码和非静态代码、对应构造器代码组成
   * 非静态实例变量显示赋值代码和非静态代码块**从上到下顺序**执行，而**对应的构造器代码最后执行**
   * 每次创建实例对象，调用对应的构造器，执行的就是对应的<init>方法
   * <init>()方法的首行是super()或super(实参列表)，即对应父类的<init>()方法

3.3 方法的重写(Override)

1. 不可被重写的方法
   * final方法
   * 静态方法
   * private等子类中不可见方法
2. 对象的多态性
   * 子类如果重写了父类的方法，通过子类对象调用的一定是子类重写过的代码
   * 非静态方法默认的调用对象是this
   * this对象在构造器或者说是<init>方法中就是正在创建的对象

### 4 、方法的参数传递机制

* 形参是基本数据类型
  * 传递是数据值

* 实参是引用数据类型
  * 传递地址值
  * 特殊的类型：String、包装类等对象不可变性
    * String类型每次创建一个新的对象，而不是原来的对象
    * Integer类型-128~127存在常量池中，其余的每次都创建新对象

### 5、递归和迭代

```tex
有n步台阶，一次只能上1步或者2步，共有多少种走法？
```

5.1解法一：递归（斐波那契数列）

* 当n=1时

  * 分析：直接一步完成
  * 结果：f(1)=1

* 当n=2时

  * 分析：
    * 一步+一步
    * 直接两步
  * 结果：f(2)=2

* 当n=3时

  * 分析：
    * 最后一次走一步-->f(3-1)=f(2)
    * 最后一次走两步-->f(3-2)=f(1)

  * 结果：f(3)=f(2)+f(1)

* 当n=4时

  * 分析：
    - 最后一次走一步-->f(4-1)=f(3)
    - 最后一次走两步-->f(4-2)=f(3)

  - 结果：f(4)=f(3)+f(2)

* 以此类推

  ......

* n=x时

  * f(x)=f(x-1)+f(x-2)

  ```java
  /**
   * 斐波那契数列递归写法
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
  ```

  

5.2解法二：循环迭代

* 分析同上，只不过正向累加

  ```java
  /**
   * 斐波那契数列循环迭代写法
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
          j = k;
          k = sum;
      }
      return sum;
  }
  ```

### 6、成员变量与局部变量

6.1区别

* 声明的位置
  * 局部变量：方法体内、形参、代码块
  * 成员变量：类中方法外
    * 类变量：有static修饰的
    * 实例变量：没有static修饰的

* 修饰符
  * 局部变量：final
  * 成员变量：public、protected、private、final、static、volatile、transient

* 值存储的位置
  * 局部变量：栈
  * 实例变量：堆
  * 类变量：方法区

* 作用域
  * 局部变量：从声明开始，到所属的 } 结束
  * 实例变量：在当前类中使用"this."访问（this可省略），在其他类中使用“对象名.”访问
  * 类变量：