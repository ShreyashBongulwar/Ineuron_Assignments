package in.assignment.Q3;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any no : ");
		int no=sc.nextInt();
		int ans=getSum(no);
		System.out.println("the sum is :"+ans);
		
	}
	public static int getSum(int n)
    {
        if (n <= 1)
            return n;
        return n + getSum(n - 1);
    }
}
