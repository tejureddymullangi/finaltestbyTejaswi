package javatest;

import java.util.Scanner;

public class Fibonaccisequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0, b=1, c, i=3 ,n;
		System.out.print("Enter the number:");
		n=sc.nextInt();
		System.out.print(a + " "+ b);
		while(i<=n) {
			c=a+b;
			System.out.print(" " +c);
			a = b;
			b = c;
			i++;
		
		}

	}

}


