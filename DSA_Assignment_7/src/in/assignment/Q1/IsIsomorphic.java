package in.assignment.Q1;

import java.util.HashMap;

public class IsIsomorphic {

	public static void main(String[] args) {

		String s="eggipo";
		String t="addcqx";
		Boolean ans=isIsomorphic(s,t);
		System.out.println(ans);
	}

	private static Boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) return false;
        if(s.equals(t)) return true;

        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++) 
        {
            // if contains key but with different value
            if(map.containsKey(s.charAt(i))) {
                if(!map.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }else{
                // contains value with different key
                if(map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
	}
	

}
