package in.assignment.Q6;

public class SearchElement {

	public static void main(String[] args) {

		int [] nums= {-1,0,3,5,9,12};
		int target=9;
		int index=searchElement(nums,target);
		System.out.println(index);
	}

	private static int searchElement(int[] nums, int target) {
		int start=0;
        int end=nums.length-1;
        return findElement(nums,target,start,end);
	}

	private static int findElement(int[] nums, int target, int start, int end) {
		if(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                return findElement(nums,target,start,mid-1);
            }
            else
            {
                return findElement(nums,target,mid+1,end);
            }
            
        }
        return -1;
	}

}
