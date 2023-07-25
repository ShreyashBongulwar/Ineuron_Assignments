package in.assignment.Q1;

import java.util.*;
public class IsPowerOfTwo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any no : ");
		int no=sc.nextInt();
		Boolean ans=isPowerOfTwo(no);
		if(ans)
		{
			System.out.println("provided number is power of two");
		}else
		{
			System.out.println("Provided number is not power of two");
		}
	}
	public static boolean isPowerOfTwo(int n) 
    {
        return isPower(n);
    }
    public static boolean isPower(int n)
    {
        if(n==0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        if(n%2==0)
        {
            return isPower(n/2);
        }
        else
        {
            return false;
        }
    }

}
