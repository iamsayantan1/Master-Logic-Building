package com.sayantandas.masterlogicbuildingpdf.p3recursion;

public class L4StringBasedRecursion {
    //1. Reverse a string using recursion.
    private static String reverse(String s) {
        if (s == null || s.isBlank()) return "";
        return reverse(s.substring(1)) + s.charAt(0);
    }

    //2. Check if a string is palindrome using recursion.
    private static boolean palindrome(String s) {
        if (s == null || s.isBlank() || s.length()==1) return true;
        else if (s.charAt(0) == s.charAt(s.length()-1)) {
            return palindrome(s.substring(1,s.length()-1));
        }
        else return false;
    }

    //3. Count vowels in a string recursively.
    private static int countVowels(String s) {
        if (s==null || s.isBlank()) return 0;
        return (("aeiou".indexOf(Character.toLowerCase(s.charAt(0))) == -1) ? 0 : 1) + countVowels(s.substring(1));
    }

    //4. Remove all spaces from a string recursively.
    private static String removeAllSpaces(String s) {
        if (s==null || s.isBlank()) return "";
        char ch = s.charAt(0);
        return ((ch == ' ') ? "" : String.valueOf(ch)) + removeAllSpaces(s.substring(1));
    }

    //5. Replace all occurrences of a character (say ‘a’ → ‘x’) recursively.
    private static String replaceChars(String s) {
        if (s==null || s.isBlank()) return "";
        char ch = s.charAt(0);
        return ((ch == 'a') ? 'x' : String.valueOf(ch)) + replaceChars(s.substring(1));
    }

    //6. Remove all occurrences of a character from a string recursively.
    private static String removeChars(String s) {
        if (s==null || s.isBlank()) return "";
        char ch = s.charAt(0);
        return ((ch == 'a') ? "" : String.valueOf(ch)) + removeChars(s.substring(1));
    }

    //7. Print all characters of a string one by one recursively.
    private static void printChars(String s) {
        if (s==null || s.isBlank()) return;
        System.out.println(s.charAt(0));
        printChars(s.substring(1));
    }

    //8. Print the string in reverse order recursively (without using loops).
    private static void printStrInReverse(String s) {
        if (s==null || s.isBlank()) return;
        printStrInReverse(s.substring(1));
        System.out.print(s.charAt(0));
    }

    //9. Convert a string to uppercase recursively.
    private static String toUpperCase(String s) {
        if (s==null || s.isBlank()) return "";
        return Character.toUpperCase(s.charAt(0)) + toUpperCase(s.substring(1));
    }

    //10. Count consonants and vowels separately using recursion.
    private static void countVowelAndConsonant(String s) {
        int vowelCount = countVowel(s);
        int consonantCount = countConsonant(s);

        System.out.println("Vowel: " + vowelCount + ", and Consonant: " + consonantCount);
    }

    private static int countVowel(String s) {
        if (s==null || s.isBlank()) return 0;
        char ch = Character.toLowerCase(s.charAt(0));
        return ("aeiou".indexOf(ch)==-1 ? 0 : 1) + countVowel(s.substring(1)) ;
    }

    private static int countConsonant(String s) {
        if (s==null || s.isBlank()) return 0;
        char ch = Character.toLowerCase(s.charAt(0));
        return ((Character.isLetter(ch) && "aeiou".indexOf(ch)==-1) ? 1 : 0) + countConsonant(s.substring(1));
    }
}
