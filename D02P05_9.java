package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_9 {
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
    	System.out.print("Enter your sentence ");
    	String str = s.nextLine();   	   
        String replace = str.replace(" ", "%20");    
        System.out.println(" " + replace);
    }
}
