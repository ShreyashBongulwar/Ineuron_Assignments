package in.assignment.Q4;

import java.util.Arrays;

public class ArrayPartition {

	public static void main(String[] args) {

		int[] nums= {1,4,3,2};
		int ans= arrayPartition(nums);
		System.out.println(ans);
	}

	private static int arrayPartition(int[] nums) {
		Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            
                sum=sum+nums[i];
            
        }
        return sum;
	}

}
