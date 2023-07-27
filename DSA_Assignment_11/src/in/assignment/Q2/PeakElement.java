package in.assignment.Q2;
import java.util.*;
public class PeakElement {

	public static void main(String[] args) {
		int[] nums = {1,2,1,3,5,6,4};
		int ans=findPeakElement(nums);
		System.out.println(ans);
		
	}

	public static int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
            
        }
        return start;
        
        
    }
}
