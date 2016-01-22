/********************
 * ����������صĺ���
 ********************/

class BooleanArrayRelated
{
	/***********************************************************************
	* ����һ�����к��кŻ���ʱ����λ�õ�ֵΪtrue(����Ϊfalse)�Ķ�ά��������
	* ʹ����ŷ������㷨(�ⲿ)
	* ����(����������)
	* ����һ����ά��������
	***********************************************************************/
	public static boolean[][] genRowColCoPrimeArray(int rows, int cols)
	{
		boolean[][] a = new boolean[rows][cols];
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				if (Euclid.gcd(i, j) == 1)	//�ⲿ
				{	
					a[i][j] = true;
				}
				else
				{
					a[i][j] = false;
				}//if
			}//for j(col)
		}//for i(row)
		return a;
	}//genRowColCoPrimeArray
	
	/*****************************************
	 * ��ӡһ����ά��������
	 * ����(������������������)
	 * ��ӡ������飬'*' == true��' ' == false
	 *****************************************/
	public static void printArray(boolean[][] a, int rows, int cols)
	{
		System.out.print("    ");	//�ȴ�ӡ4���ո�
		//��ӡ��һ�У��к�
		for (int i = 0; i < cols; i++)
		{
			System.out.printf("%2d", i);	//�к�,2���
			if (i != cols - 1)	//���һ���к�ǰ��
			{
				System.out.printf("%s", " ");	//�Կո�ָ�
			}
			else
			{
				System.out.println();	//���һ��Ԫ�أ�����
			}
		}//[!]for
		
		for (int i = 0; i < rows; i++)
		{
			//��ӡ�к�, ���3
			System.out.printf("%3d%s", i, " ");
		
			for (int j = 0; j < cols; j++)
			{
				//true='*', false=' '
				//���2���ո�ָ�
				if (a[i][j])
				{
					System.out.printf("%2s", "*");
				}
				else
				{
					System.out.printf("%2s", " ");
				}
				if (j != cols - 1)
				{
					System.out.printf(" ");
				}
				else
				{
					System.out.println();
				}
			}//for j
		}//for i
	}//Print2DBooleanArray
	
	/************************************************
	 * �������л�ȡ���������������ɲ���ӡһ����ά����
	 * ����(�У���)
	 ************************************************/
	public static void main(String[] args)
	{
		int rows = Integer.parseInt(args[0]);
		int cols = Integer.parseInt(args[1]);
		
		boolean[][] a = genRowColCoPrimeArray(rows, cols);
		printArray(a, rows, cols);
	}
}