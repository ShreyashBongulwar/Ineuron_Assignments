package in.assignment.Q3;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		int ans=missingNumber(nums);
		System.out.println(ans);
		
	}

	public static int missingNumber(int[] arr) 
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        int index=0;
        for(index=0;index<arr.length;index++)
        {
            if(arr[index]!=index)
            {
                return index;
            }
        }
        return index;//arr.length;
    }
    static void swap(int arr[],int first,int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
