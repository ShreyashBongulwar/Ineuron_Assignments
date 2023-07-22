package in.assignment.Q4;

import java.util.*;

public class ReverseWords {

	public static void main(String[] args) {

		String s="hey shreeyash";
		String ans=reverseWords(s);
		System.out.println(ans);
	}

	private static String reverseWords(String s) {
		char []arr=s.toCharArray();
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            start=i;
            while(i<arr.length && arr[i]!=' ')
            {
                i++;
            }
            end=i-1;
            while(start<end)
            {
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return new String(arr);
	}
	

}
