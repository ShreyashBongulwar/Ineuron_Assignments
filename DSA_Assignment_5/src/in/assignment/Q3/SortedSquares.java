package in.assignment.Q3;

public class SortedSquares {

	public static void main(String[] args) {
		int[] nums= {-4,-1,0,3,10};
		nums=sortedSquares(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}

	}
	public static int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=ans.length-1;
        while(k>=0)
        {
            if( Math.abs(nums[i]) > Math.abs(nums[j]) )
            {
                ans[k]=nums[i]*nums[i];
                k--;
                i++;
            }
            else
            {
                ans[k]=nums[j]*nums[j];
                j--;
                k--;
            }
        }
        return ans;
        
        
    }

}
