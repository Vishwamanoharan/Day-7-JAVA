class P8 
{
	public static void main(String[] args) 
	{
		char ch='A';
		int num=1,n=5;
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i+j<=n-1)
				{
					if (i%2==0)
					{
						System.out.print(ch++);
					}
					else{
						System.out.print(num++);
					}

					if (ch=='D')
		{
			ch='A';
		}
		if (num==4)
		{
			num=1;
		}
					
					
				}
			
			}

			System.out.println();
		}
		
	}
}
