class P7 
{
	public static void main(String[] args) 
	{
		int num=1,n=5;
		char ch='A';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0)
				{
					System.out.print(ch++);
				}
				else if (i==1)
				{
					System.out.print(num++);
				}
				else if (i==n/2)
				{
					
					System.out.print(--ch);
				}
				else if (i==n-2)
				{
					System.out.print(num++);
				}
				else if (i==n-1)
				{
					
					System.out.print(ch++);
				}

			}
			System.out.println();
		}
			}
}
