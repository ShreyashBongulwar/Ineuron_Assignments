package in.assignment.Q1;

import java.util.Arrays;

public class SumClosest {

	public static void main(String[] args) {
		int [] nums= {-1,2,1,-4};
		int target=1;
		int ans = sumClosest(nums,target);
		System.out.println(ans);

	}

	private static int sumClosest(int[] arr, int target) {
		int result=arr[0]+arr[1]+arr[arr.length-1];
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {
            int start=i+1;
            int end=arr.length-1;
            while(start<end)
            {
                int sum=arr[i]+arr[start]+arr[end];
                if(sum<target)
                {
                    start++;
                }
                else
                {
                    end--;
                }
                if(Math.abs(sum-target)<Math.abs(result-target))
                {
                    result=sum;
                }
            }
        }
        return result;
	}

}
