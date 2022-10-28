package in.assignment1;

public class Pattern3 {

	
		public void display(int n){
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++){
					if(i==n-1 || i+j>=(n-1)+(n/2) || i-j>=n/2)  {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
		}

	

}
