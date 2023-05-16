class P6 
{
	public static void main(String[] args) 
	{
		char ch='A';

		for (int i=0;i<5 ;i++ )
		{
			for (int j=0;j<5 ;j++ )
			{
				if (j%2==0)
				{
					System.out.print("*");
				}
				else{
					System.out.print(ch++);
				}
			}
			System.out.println();
		}
		
	}
}
