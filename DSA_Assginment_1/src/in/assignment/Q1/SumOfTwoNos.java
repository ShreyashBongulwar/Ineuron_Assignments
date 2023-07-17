package in.assignment.Q1;
import java.util.*;
public class SumOfTwoNos {

	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		int target=9;
		int[] ans=TwoSum(nums,target);
		System.out.println(ans[0]+" "+ans[1]);

	}

	private static int[] TwoSum(int[] nums, int target) {
		HashMap<Integer,Integer>map=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int remain=target-n;
            if(map.containsKey(remain))
            {
                res[1]= i;
                res[0]=map.get(remain);
                break;
            }
            map.put(n,i);
        }
        return res;
	}

}
