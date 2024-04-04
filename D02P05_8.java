
package com.learning.core.day2session1;
public class D02P05_8 {
    public static void main(String[] args) {
        String input = "helloworld";
        boolean canSplit = canSplitIntoFourDistinctStrings(input);
        System.out.println(canSplit ? "Yes" : "No");
    }

    public static boolean canSplitIntoFourDistinctStrings(String input) {
        if (input.length() % 4 != 0) {
            return false; 
        }
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int occurrences = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    occurrences++;
                }
            }
            if (occurrences > 1) {
                return false; 
            }
        }
        return true;
    }
}
