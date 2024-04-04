package com.learning.core.day2session1;
import java.util.Scanner;
public class D02P05_6{
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter the string: ");

    	String str = s.nextLine();
        int result = longestPrefixSuffixLength(str);
        System.out.println("Suffix: " + result);
    }
    
    public static int longestPrefixSuffixLength(String s) {
    	int n = s.length();
    	int len = n / 2;
    	while (len > 0 && !s.substring(0, len).equals(s.substring(n - len))) {
    	    len--;
    	}
    	return len;
    }
        
    }
