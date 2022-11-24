package in.assignment4;

import java.util.Scanner;

public class CheckPanagram {
	static int size = 26;


	public static void main(String[] args) {

		Scanner sobjScanner = new Scanner(System.in);
		System.out.print("Enter string :");
		String string = sobjScanner.nextLine();
		int len = string.length();

		// Function Call
		if (allLetter(string, len))
			System.out.println("Yes the string is panagram");
		else
			System.out.println("No the string is not panagram");
	}

	static boolean allLetter(String str, int len) {

		str = str.toLowerCase();

		boolean[] present = new boolean[size];

		for (int i = 0; i < len; i++) {

			if (isLetter(str.charAt(i))) {

				int letter = str.charAt(i) - 'a';
				present[letter] = true;
			}
		}

		for (int i = 0; i < size; i++) {


			if (!present[i])
				return false;
		}
		return true;
	}
    static boolean isLetter(char ch)
    {
        if (!Character.isLetter(ch))
            return false;
 
        return true;
    }

}
