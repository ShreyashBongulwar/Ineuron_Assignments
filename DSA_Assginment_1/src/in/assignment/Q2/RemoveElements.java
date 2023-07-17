package in.assignment.Q2;

public class RemoveElements {

	public static void main(String[] args) {

		int[]nums= {3,2,2,3};
		int val=3;
		int k=removeElements(nums,val);
		for(int i=0;i<k;i++)
		{
			System.out.print(nums[1]+" ");
		}
	}

	private static int removeElements(int[] nums, int val) {
		int j = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            int n = nums[i];
            if (n != val) {
                nums[j++] = n;
              }
        }
        return j;
	}

}
