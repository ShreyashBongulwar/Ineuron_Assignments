package in.assignment.Q5;

public class MergeSortedArray {

	public static void main(String[] args) {

		int []n1 = {1,2,3,0,0,0};
		int m = 3;
		int [] n2 = {2,5,6};
		int n = 3;
		int p1=m-1,p2=n-1,i=n+m-1;
		while(p2>=0)
		{
		    if(p1>=0 && n1[p1]>n2[p2])
		    {
		        n1[i--]=n1[p1--];
		    }
		    else
		    {
		        n1[i--]=n2[p2--];
		    }
		}
		for(i=0;i<n1.length;i++)
		{
			System.out.print(n1[i]+" ");
		}
	}

}
