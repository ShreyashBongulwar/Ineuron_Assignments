package in.assignment.Q6;
import java.util.*;
public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		Boolean ans=containsDuplicate(nums);
		System.out.println(ans);
		
		
	}

	private static Boolean containsDuplicate(int[] nums) {
		Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            if (!map.containsKey(num))
                map.put(num, 1);
            else
            {
               return true;
            }
            
        }
        return false;
	}

}
