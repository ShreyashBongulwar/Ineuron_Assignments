package in.assignment.Q2;
import java.util.*;
public class DistributedCandies {

	public static void main(String[] args) {
		int[] nums= {1,1,2,2,3,3};
		int ans=distributedCandies(nums);
		System.out.println(ans);

	}

	private static int distributedCandies(int[] candyType) {
		Set<Integer>st=new HashSet<>();

	    for(int i=0;i<candyType.length;i++){
	        st.add(candyType[i]);
	        if(st.size()>candyType.length/2)return candyType.length/2;
	    }

	    return st.size();
	}

}
