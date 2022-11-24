package in.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class IsSubset {

	public static void main(String[] args) {
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of an array1");
		int n1=sobj.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter the elements of an array1");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sobj.nextInt();
		}   
		System.out.println("Enter the size of an arr2 , should be less than arr1");
		int n2=sobj.nextInt();
		int arr2[]=new int[n2];
		System.out.println("Enter the elements of an array1");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sobj.nextInt();
		} 
		if (isSubset(arr1, arr2, n1, n2))
            System.out.println("arr2 is a subset of arr1");
        else
            System.out.println(
                "arr2 is not a subset of arr1");
		
 
        
	}
	static boolean isSubset(int arr1[], int arr2[], int m, int n)
	{
		int i = 0, j = 0;

		if (m < n)
			return false;

		Arrays.sort(arr1); // sorts arr1
		Arrays.sort(arr2); // sorts arr2

		while (i < n && j < m) {
			if (arr1[j] < arr2[i])
				j++;
			else if (arr1[j] == arr2[i]) {
				j++;
				i++;
			}
			else if (arr1[j] > arr2[i])
				return false;
		}

		if (i < n)
			return false;
		else
			return true;
	}

}
