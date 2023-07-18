package in.assignment.Q5;

import java.util.Arrays;

public class MaximumProduct {

	public static void main(String[] args) {

		int[] nums= {1,4,3,2};
		int ans= maximumProduct(nums);
		System.out.println(ans);
	}

	private static int maximumProduct(int[] arr) {
		Arrays.sort(arr);
        int n=arr.length;
        int prod1=arr[n-1]*arr[n-2]*arr[n-3];
        int prod2=arr[0]*arr[1]*arr[n-1];
        return Math.max(prod1,prod2);
	}

}
