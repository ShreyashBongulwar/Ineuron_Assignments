package in.assignment.Q6;
import java.util.*;
public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums= {4,3,2,7,8,2,3,1};
		List<Integer>ans=new ArrayList<>();
		ans=findDuplicates(nums);
		for(int i=0;i<ans.size();i++)
		{
			System.out.print(ans.get(i)+" ");
		}

	}
	public static List<Integer> findDuplicates(int[] arr) {
		List<Integer>al=new ArrayList<>();
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
                al.add(arr[index]);
            }
        }
        return al;
    }
    static void swap(int arr[],int first,int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
        
    

}
