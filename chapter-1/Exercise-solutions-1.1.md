# 练习的解法 #

1.1.1 
* a.  7
  * 因为是整数除法
* b.  200.0000002
* c.  true
  * && 的优先级最高，||次之，原式化为 false || true，结果是true
  
1.1.2
* a.  double  1.618
* b.  double  10.0
* c.  boolean true
* d.  String  "33"

1.1.3  
`Foo.java`
```java
class Foo	//类名必须和文件名相同
{
	public static int bar(int a, int b, int c)
	{
		if((a == b)&&(a == c))
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
	
	public static void main(String args[])
	{
		//获取3个命令行参数，转换为整数
		//参数不够 会抛出异常
		//传入的不是整数 会抛出异常
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		if (bar(n1, n2, n3) == 0)
		{
			System.out.print("equal");
		}
		else{
			System.out.print("not equal");
		}
	}
}
```

1.1.4
* a.  then是多余的，java没有这个关键词
* b.  `a > b`必须用圆括号包围
* c.  正确
* d.  `c = 0`后应当加一个`;`

1.1.5  
`IsBetweenZeroAndOne.java`
```java
class IsBetweenZeroAndOne
{
	
	public static boolean check(double x, double y)
	{
		return check(x)&&check(y);
	}

	// 重载的函数，检查num是否位于指定范围
	public static boolean check(double num)
	{
		if(num > 0 && num < 1)
			return true;
		else
			return false;
	}
	
	public static void main(String args[])
	{
		//从命令行接受参数吧
		double n1 = Double.parseDouble(args[0]);
		double n2 = Double.parseDouble(args[1]);
		System.out.print(check(n1, n2));
	}
}
```

1.1.6  
* 总共会打印16次，i∈[0,15]
* f变成f和g的和
* g变成之前的f
```
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
620
```
以下代码保存为`WillPrintWhat.java`后编译运行
```java
class WillPrintWhat
{
	public static void main(String[] args)
	{
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++)
		{
			System.out.println(f);
			f = f + g;
			g = f - g;
		}
	}
}
```

1.1.7
* a.  `存疑`
* b.  499500
  * 外层循环执行999次，i∈[1,1000)
  * 内层循环执行i次，每次执行时sum自增1，即循环完毕sum自增i
  * 综合上2条，sum=1+2+3+...+998+999
  * sum=(1+999)÷2×999=499500
* c.  9000
  * 外层循环执行9次。i从1开始，步长2i --> `1 2 4 8 16 32 64 128 512` 1024(>1000)。
  * 内层循环执行1000次，每次执行时sum自增1，即循环完毕sum自增1000
  * 综上所述，sum=9*1000=9000
  
1.1.8
* a.  b
* b.  bc
* c.  e

1.1.9
