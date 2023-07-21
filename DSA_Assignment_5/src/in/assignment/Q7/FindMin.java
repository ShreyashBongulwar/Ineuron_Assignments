package in.assignment.Q7;
import java.util.*;
public class FindMin {

	public static void main(String[] args) {
		int[] nums= {4,5,6,7,0,1,2};
		int ans=0;
		ans=findMin(nums);
		System.out.print(ans);
		

	}
	public static int findMin(int[] nums) 
    {
        int pivot=findPivot(nums);
        if(pivot==-1)
        {
            return nums[0];
        }
        else
        {
            return nums[pivot+1];
        }
        
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    

}
