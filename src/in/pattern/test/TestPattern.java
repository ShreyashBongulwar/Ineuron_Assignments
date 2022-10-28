package in.pattern.test;

import java.util.Scanner;

import in.assignment1.Pattern1;
import in.assignment1.Pattern2;
import in.assignment1.Pattern3;
import in.assignment1.Pattern4;
import in.assignment1.PrintIneuron;



public class TestPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		PrintIneuron pt=new PrintIneuron();
		pt.display(n);
		System.out.println();
		Pattern1 pt1=new Pattern1();
		pt1.display(n);
		System.out.println();
		Pattern2 pt2=new Pattern2();
		pt2.display(n);
		System.out.println();
		Pattern3 pt3=new Pattern3();
		pt3.display(n);
		System.out.println();
		Pattern4 pt4=new Pattern4();
		pt4.display(n);
		System.out.println();
		

	}

}
