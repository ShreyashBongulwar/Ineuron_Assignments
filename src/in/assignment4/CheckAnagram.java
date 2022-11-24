package in.assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sobjScanner=new Scanner(System.in);
		System.out.print("Enter string1 :");
		String string1 =sobjScanner.nextLine();
		System.out.print("Enter string2 :");
		String string2 =sobjScanner.nextLine();
		char[]str1=string1.toCharArray();
		char[]str2=string2.toCharArray();
		boolean ans=areAnagram(str1, str2);
		if(ans)
		{
			System.out.println("strings are anagram");
		}
		else {
			System.out.println("strings are not anagram");
		}

	}
	static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;
 
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
    }

}
