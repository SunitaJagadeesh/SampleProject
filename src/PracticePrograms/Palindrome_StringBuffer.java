package PracticePrograms;

import java.util.Scanner;

public class Palindrome_StringBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String OriginalStr = sc.next();
		
		StringBuffer sb = new StringBuffer(OriginalStr);       // convert OriginalStr to StringBuffer.... StringBuffer syntax
		sb.reverse();                                          //reverses the StringBuffer
		
		String ReverseStr = sb.toString();              //sb.toString converts buffer to string and stores new string ReverseStr
		
		if(OriginalStr.equals(ReverseStr))
			System.out.println(OriginalStr + " is a Palindrom");
		else
			System.out.println(OriginalStr + " is not a palindrome");
	}
}
