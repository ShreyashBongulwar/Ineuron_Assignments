package in.assignment.Q5;
import java.util.*;
public class Intersection 
{

	public static void main(String[] args) {
		int[] nums1 = {9,4,9,8,4};
		int[] nums2 = {4,9,5};
		int []ans=intersection(nums1,nums2);

		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
	public static int[] intersection(int[] nums1, int[] nums2) 
    {
	      Set<Integer>s=new HashSet<>();
	      Arrays.sort(nums2);
	      for(int i=0;i<nums1.length;i++)
	      {
	          if(BinarySearch(nums2,nums1[i]))
	          {
	              s.add(nums1[i]);
	          }
	     }
	      int ans[]=new int[s.size()];
	      int j=0;
	      for (Integer num : s)
	      {
	          ans[j] = num;
	          j++;
	      }
	      return ans;
    }
	public static boolean BinarySearch(int arr[],int target)
	{
	      int start=0;
	      int end=arr.length-1;
	      while(start<=end)
	      {
	          int mid=start+(end-start)/2;
	          if(target<arr[mid])
	          {
	              end=mid-1;
	          }
	          else if(target>arr[mid])
	          {
	              start=mid+1;
	          }
	          else
	          {
	              return true;
	          }
	
	      }
	      return false;
	}
}
