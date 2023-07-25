package in.assignment.Q2;

import java.util.*;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any no : ");
		int no=sc.nextInt();
		int ans=getFactorial(no);
		System.out.println("the sum is :"+ans);
		
	}
	public static int getFactorial(int n)
    {
		if (n == 0)
            return 1;
  
        return n * getFactorial(n - 1);
    }
}
