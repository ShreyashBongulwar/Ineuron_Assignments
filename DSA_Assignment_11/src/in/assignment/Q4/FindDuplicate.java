package in.assignment.Q4;
import java.util.*;
public class FindDuplicate {

	public static void main(String[] args) {
		int[] nums = {3,1,3,4,2};
		int ans=findDuplicate(nums);
		System.out.println(ans);
		
	}
	public static int findDuplicate(int nums[]) 
    {
        Arrays.sort(nums);
        
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            int iCnt=0;
            for(int i=0;i<=mid;i++)
            {
                if(nums[i]<=mid)
                {
                    iCnt++;
                }
            }
            if(iCnt<=mid)
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return start;
        
    }
}
