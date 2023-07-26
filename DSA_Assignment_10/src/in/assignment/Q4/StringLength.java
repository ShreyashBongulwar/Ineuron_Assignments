package in.assignment.Q4;
import java.util.*;
public class StringLength {

	public static void main(String[] args) {
		String str ="GeeksforGeeks";
        System.out.println(recLen(str));
		
	}

	public static int  recLen(String str){
		if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
            
    }
}
