package in.assignment.Q5;

public class PlusOne {

	public static void main(String[] args) {
		int[]nums= {1,2,3};
		int [] ans = plusOne(nums);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(nums[i]);
		}


	}

	private static int[] plusOne(int[] digits) {
		for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]+=1;
                return digits;
            }
            else
            {
                digits[i]=0;
            }
        }
        int[] plus = new int[digits.length+1];
        plus[0] = 1;
        

        return plus;
	}

}
