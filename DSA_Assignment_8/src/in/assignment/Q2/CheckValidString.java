package in.assignment.Q2;

public class CheckValidString {

	public static void main(String[] args) {
		
		String s="(*))";
		Boolean ans=checkValidString(s);
		System.out.println(ans);

	}
	public static boolean checkValidString(String s) {
        int cmin = 0, cmax = 0; 
        for (char c : s.toCharArray()) {
            if (c == '(') {
                cmax++;
                cmin++;
            } else if (c == ')') {
                cmax--;
                cmin--;
            } else if (c == '*') {
                cmax++;
                cmin--; 
              
            }
            if (cmax < 0) return false; 
            cmin = Math.max(cmin, 0);   
        }
        return cmin == 0;
    }

}
