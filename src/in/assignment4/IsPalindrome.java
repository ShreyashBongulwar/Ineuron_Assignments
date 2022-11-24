package in.assignment4;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobj=new Scanner(System.in);
		System.out.print("enter the number :");
		int n=sobj.nextInt();
		int n1=reverseDigits(n);
		if(n==n1)
		{
			System.out.println("given number is pallindrome");
		}
		else {
			System.out.println("given number is not pallindrome");
		}
		

	}
	static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
     
    
}
