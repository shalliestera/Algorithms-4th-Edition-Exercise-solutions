class Euclid
{
	/****************************************
	 * ʹ��ŷ������㷨���������������Լ��
	 * ����(����p������q)
	 * ����p��q�����Լ��
	 ****************************************/
	public static int gcd(int p, int q)
	{
		if (q == 0)
			return p;
		else
			return gcd(q, p%q);
	}
	
	/**********************************
	 * �������л�ȡ2������Ȼ�����gcd()
	 **********************************/
	public static void main(String[] args)
	{
		//����gcd(p,q)
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		System.out.println(gcd(n1, n2));
	}
}