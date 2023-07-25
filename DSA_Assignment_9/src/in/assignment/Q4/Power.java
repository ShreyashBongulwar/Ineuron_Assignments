package in.assignment.Q4;

import java.util.*;
public class Power {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any no : ");
		int no1=sc.nextInt();
		System.out.println("Enter any power : ");
		int no2=sc.nextInt();
		int ans=power(no1,no2);
		System.out.println("the power is :"+ans);
		
	}
	static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
}
