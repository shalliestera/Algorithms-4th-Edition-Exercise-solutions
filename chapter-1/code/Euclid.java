class Euclid
{
	/****************************************
	 * 使用欧几里得算法计算两个数的最大公约数
	 * 参数(数字p，数字q)
	 * 返回p和q的最大公约数
	 ****************************************/
	public static int gcd(int p, int q)
	{
		if (q == 0)
			return p;
		else
			return gcd(q, p%q);
	}
	
	/**********************************
	 * 从命令行获取2个整数然后调用gcd()
	 **********************************/
	public static void main(String[] args)
	{
		//测试gcd(p,q)
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		System.out.println(gcd(n1, n2));
	}
}