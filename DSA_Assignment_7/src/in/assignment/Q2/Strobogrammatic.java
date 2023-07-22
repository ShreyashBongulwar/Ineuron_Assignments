package in.assignment.Q2;

import java.util.*;

public class Strobogrammatic {

	public static void main(String[] args) {

		String s="689";
		Boolean ans=isStrobogrammatic(s);
		System.out.println(ans);
	}

	private static Boolean isStrobogrammatic(String num) {
		Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        int l = 0, r = num.length() - 1;
        while (l <= r) {
            if (!map.containsKey(num.charAt(l))) return false;
            if (map.get(num.charAt(l)) != num.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
	}
	

}
