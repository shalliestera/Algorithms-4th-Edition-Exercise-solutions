/********************
 * 布尔数组相关的函数
 ********************/

class BooleanArrayRelated
{
	/***********************************************************************
	* 生成一个当行号列号互质时，该位置的值为true(否则为false)的二维布尔数组
	* 使用了欧几里得算法(外部)
	* 参数(行数，列数)
	* 返回一个二维布尔数组
	***********************************************************************/
	public static boolean[][] genRowColCoPrimeArray(int rows, int cols)
	{
		boolean[][] a = new boolean[rows][cols];
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				if (Euclid.gcd(i, j) == 1)	//外部
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
	 * 打印一个二维布尔数组
	 * 参数(数组名，行数，列数)
	 * 打印这个数组，'*' == true，' ' == false
	 *****************************************/
	public static void printArray(boolean[][] a, int rows, int cols)
	{
		System.out.print("    ");	//先打印4个空格
		//打印第一行，列号
		for (int i = 0; i < cols; i++)
		{
			System.out.printf("%2d", i);	//行号,2宽度
			if (i != cols - 1)	//最后一个行号前，
			{
				System.out.printf("%s", " ");	//以空格分隔
			}
			else
			{
				System.out.println();	//最后一个元素，换行
			}
		}//[!]for
		
		for (int i = 0; i < rows; i++)
		{
			//打印行号, 宽度3
			System.out.printf("%3d%s", i, " ");
		
			for (int j = 0; j < cols; j++)
			{
				//true='*', false=' '
				//宽度2，空格分隔
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
	 * 从命令行获取行数和列数，生成并打印一个二维数组
	 * 参数(行，列)
	 ************************************************/
	public static void main(String[] args)
	{
		int rows = Integer.parseInt(args[0]);
		int cols = Integer.parseInt(args[1]);
		
		boolean[][] a = genRowColCoPrimeArray(rows, cols);
		printArray(a, rows, cols);
	}
}