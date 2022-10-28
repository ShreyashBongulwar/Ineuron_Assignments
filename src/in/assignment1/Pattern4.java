package in.assignment1;

public class Pattern4 {

	
		public void display(int n)
		{
			for(int i=0;i<n;i++) 
			{
				for(int j=0;j<n;j++)
				{
					if(i==0 || j==0 || i==n-1 ||
							i+j<=n/2 || i-j>=n/2)  
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
		}
	
}
