package in.assignment2;

import java.util.Scanner;

public class FindDuplicates {
	
	public static void main(String[] args){
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sobj.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sobj.nextInt();
		}        
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
		
	}

}
