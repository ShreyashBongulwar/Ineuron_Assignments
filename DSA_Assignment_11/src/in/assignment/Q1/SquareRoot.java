package in.assignment.Q1;
import java.util.*;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans=mySqrt(n);
		System.out.println(ans);
		
	}

	public static int mySqrt(int x) 
    {
        int ans=0;
        if(x==0 || x==1)
        {
            return x;
        }
        int start=1;
        int end=x;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid>x/mid)
            {
                end=mid-1;
            }
            else
            {
                ans=mid;
                start=mid+1;
            }
            
        }
        return ans;
    }
}
