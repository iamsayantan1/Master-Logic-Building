package com.sayantandas.masterlogicbuildingpdf.p5strings;

public class C1BasicStringHandling {
    //1. Take a string input and print its length.
    private static void printlength(String str) {
        if (str == null) return;
        System.out.println("Length of " + str + " is: " + str.length());
    }

    //2. Print the first and last character of a string.
    private static void printFirstAndLastChar(String str) {
        if (str == null) return;
        System.out.println("1st character: " + str.charAt(0) + "\nLast character: " + str.charAt(str.length()-1));
    }

    //3. Convert all characters of a string to uppercase.
    private static String uppercase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }

    //4. Convert all characters of a string to lowercase.
    private static String lowercase(String str) {
        if (str == null) return null;
        return str.toLowerCase();
    }

    //5. Count how many characters (excluding spaces) are in the string.
    private static int countCharacters(String str) {
        if (str == null) return 0;

        int spaces = 0;

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                spaces++;
            }
        }

        return str.length()-spaces;
    }

    //6. Count how many words are in a sentence.
    private static int noOfWords(String str) {
        if (str == null) return 0;

        return str.split(" ").length;
    }

    //7. Take two strings and print them concatenated.
    private static void printStrings(String str1, String str2) {
        if (str1 == null && str2 ==null) System.out.println();
        else if (str1 == null) System.out.println(str2);
        else if (str2 == null) System.out.println(str1);
        else System.out.println(str1+str2);
    }

    //8. Compare two strings lexicographically (like dictionary order).
    private static void compare(String str1, String str2) {
        if (str1 == null || str2 == null) return;
        System.out.println(str1.compareTo(str2));
    }

    //9. Print the ASCII value of each character in a string.
    private static void printASCII(String str) {
        if (str == null) return;
        for (char ch : str.toCharArray()) {
            System.out.print((int)ch + " ");
        }
    }

    //10. Check whether the string is empty or not.
    private static boolean isEmpty(String str) {
        return (str == null || str.isEmpty());
    }
}
