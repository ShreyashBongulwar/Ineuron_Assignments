package in.assignment.Q1;
import java.util.*;
public class PowerOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Boolean ans=isPower(n);
		System.out.println(ans);
		
	}

	public static boolean isPower(int n){
        if(n==0)return false;
        if(n==1)return true;
        if(n%3==0)
        {
            return isPower(n/3);
        }
        else return false;
            
    }
}
