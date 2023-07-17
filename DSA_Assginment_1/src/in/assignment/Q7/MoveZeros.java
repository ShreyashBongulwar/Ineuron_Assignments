package in.assignment.Q7;

public class MoveZeros {

	public static void main(String[] args) {

		int []nums = {0,1,0,3,12};
		nums=moveZeros(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}

	private static int[] moveZeros(int[] nums) {
		int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                
                nums[j] = nums[i];
                j++;
            }
        }

        
        for (int k = j; k < nums.length; k++) {
            nums[k] = 0;
        }
        return nums;
	}

}
