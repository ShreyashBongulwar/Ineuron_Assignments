package in.assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the string :");
		Scanner sobj =new Scanner(System.in);
		String str=sobj.nextLine();
		String newString = sortString(str);  
		System.out.print("sorted string : is");
        System.out.println(newString);  
          
        //Call removeDuplicates() method to remove duplicates from the sorted string  
        removeDuplicates(newString); 
	}
	static String sortString(String str)   
    {   
       // Convert string to character array to sort it   
       char temp[] = str.toCharArray();   
         
       //sort array using array's sort () method  
       Arrays.sort(temp);   
         
       //Generate a new string from character array   
       str = new String(temp);   
           
       // Return the sorted string  
       return str;   
    }   
	static void removeDuplicates(String str)   
    {   
        //index to track the location of next character(Input string)  
        int index1 = 1;          
          
        // index to track the location of next character(Resultant string)  
        int index2 = 1;  
            
        // Convert string to character array for further manipulation  
        char arr[] = str.toCharArray();   
            
        //Check whether the character is present before it or not. If it is not present before, add it to the result string  
        while (index1 != arr.length)   
        {   
            if(arr[index1] != arr[index1-1])   
            {   
                arr[index2] = arr[index1];   
                index2++;   
            }   
            index1++;   
              
        }   
        
        str = new String(arr);  
        System.out.println("unique string is :" +str.substring(0, index2));   
    }   

}
