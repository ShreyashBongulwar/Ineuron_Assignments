package in.assignment4;

import java.util.Scanner;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjScanner = new Scanner(System.in);
		System.out.print("Enter string :");
		String string = sobjScanner.nextLine();
		if(uniqueCharacters(string)) {
			System.out.println("it contains all unique characters");
		}
		else {
			System.out.println("it does not contains all unique characters");
		}

	}
	static boolean uniqueCharacters(String str)
    {
        // If at any time we encounter 2 same
        // characters, return false
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
 
        // If no duplicate characters encountered,
        // return true
        return true;
    }

}
