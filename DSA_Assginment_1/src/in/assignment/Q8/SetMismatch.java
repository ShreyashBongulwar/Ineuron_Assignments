package in.assignment.Q8;

public class SetMismatch {

	public static void main(String[] args) {

		int[]nums = {1,2,2,4};
		nums=setMismatch(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}

	private static int[] setMismatch(int[] arr) {
		int i=0;
        while(i<arr.length)
        {
            
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
            
        }
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int arr[],int first,int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    
	}

}
