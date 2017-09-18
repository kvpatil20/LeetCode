
public class UniqueChara {
	
	public int[][] transpose(int[][] mat, int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				if(i!=j)
				{
					if(j<=i)
					{
						temp = mat[i][j];
						mat[i][j]=mat[j][i];
						mat[j][i]=temp;
					}
				}
			}
		}
		return mat;
	}

	
	public static void main(String args[])
	{
		int matrix[][]={{1,2,3,4},{5,6,7,8},{10,11,12,13},{14,15,16,17}};
		UniqueChara obj = new UniqueChara();
		int result[][]=obj.transpose(matrix, 4);
		for(int i=0;i<4;i++)
		{
			for(int j = 0;j<4;j++)
			{
				System.out.print(result[i][j]+" ");	
			}
			System.out.println();
		}
		//System.out.println("cdkn");
	}

}
