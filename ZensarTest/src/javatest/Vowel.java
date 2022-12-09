package javatest;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a word");
		Scanner reader = new Scanner(System.in);
		String input =reader.nextLine();
		char[]Letters = input.toCharArray();
		int count = 0;
		for (char c: Letters) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				default:
			}
			
		}
		System.out.println("no of vowels in string["+ input + "] is :"+count);

	}

}
