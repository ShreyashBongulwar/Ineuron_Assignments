package in.assignment2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sobj.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sobj.nextInt();
		}   
        System.out.println("Elements in given array are: ");  
        for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}  
        for(int i=0;i<n;i++)
        {
        	for(int j=1;j<n-i;j++)
        	{
        		if(arr[j]<arr[j-1])
        		{
        			int temp=arr[j];
        			arr[j]=arr[j-1];
        			arr[j-1]=temp;
        		}
        	}
        }
        System.out.println("Elements after applying bubblesort algorithm: ");  
        for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}  

	}

}
