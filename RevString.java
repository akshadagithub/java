

import java.io.*;
import java.util.Scanner;

class RevString {
	public static void main (String[] args) {
	
	String str, nstr="";
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any String:");
	str=sc.nextLine();
	
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr; 
	}
	System.out.println("Reversed String: "+ nstr);
	}
}


