package in.assignment.Q7;

public class MonotonicArray {

	public static void main(String[] args) {
		int[] nums= {1,2,2,3};
		boolean ans =  isInc(nums) || isDec(nums);
		System.out.println(ans);
		
	}
	public static boolean isInc(int[] nums){
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]) return false;
        }
        return true;
    }

    public static boolean isDec(int[] nums){
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }

}
