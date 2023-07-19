package in.assignment.Q6;
import java.util.*;
public class SingleNumber {

	public static void main(String[] args) {
		int [] nums= {4,1,2,1,2};
		int ans=singleNumber(nums);
		System.out.println(ans);

	}
	public static int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num : nums)
        {
            if(set.contains(num))
            {
                set.remove(num);
            }
            else
            {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

}
