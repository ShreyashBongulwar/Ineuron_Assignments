package in.assignment.Q2;

import java.util.*;

public class FourSum {

	public static void main(String[] args) {
		int []nums= {1,0,-1,0,-2,2};
		int target=0;
		List<List<Integer>>list=new ArrayList<>();
		list=fourSum(nums,target);
		list.forEach(System.out::println);

	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums==null || nums.length<4)
        {
            return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                int low=j+1;
                int high=nums.length-1;
                while(low<high)
                {
                    int sum=nums[i]+nums[j]+nums[low]+nums[high];
                    if(sum==target)
                    {
                        List<Integer>list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        
                        if(result.contains(list)==false)
                        {
                            result.add(list);
                        }
                        
                        low++;
                        high--;
                    }
                    else if(sum<target)
                    {
                        low++;
                    }
                    else
                    {
                        high--;
                    }
                    
                }
            }
        }
        return result;
    }

}
