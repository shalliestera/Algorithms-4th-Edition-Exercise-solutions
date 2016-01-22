# 第 1 章练习题解法代码API #

## class `Euclid` ##
欧几里得算法计算两个数的最大公约数
* `public static int gcd(int p, int q);`
  * 使用欧几里得算法计算两个数的最大公约数
  * 参数(整数p，整数q)
  * 返回p和q的`最大公约数`

* `public static void main(String[] args);`
  * 从命令行获取2个整数然后调用gcd()

## class `BooleanArrayRelated` ##
布尔数组相关的
* `public static boolean[][] genRowColCoPrimeArray(int rows, int cols);`
  * 生成一个当行号列号互质时，该位置的值为true(否则为false)的二维布尔数组
  * 使用了欧几里得算法(外部)
  * 参数(行数，列数)
  * 返回一个二维布尔数组

* `public static void printArray(boolean[][] a, int rows, int cols);`
  * 打印一个二维布尔数组
  * 参数(数组名，行数，列数)
  * 打印这个数组，'*' == true，' ' == false

* `public static void main(String[] args);`
  * 从命令行获取行数和列数，生成并打印一个二维数组
  * 参数(行，列)

## class ArrayPractice ##
[1.1.30练习题解法]  
* `public static void main(String[] args);`
  * 从命令行接受一个参数作为行和列号
  * 命令行参数(行数列数N)
  * 没有处理异常
  * 生成一个二维布尔数组并打印它

## ##
