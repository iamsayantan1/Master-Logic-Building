package com.sayantandas.masterlogicbuildingpdf.p5strings;

public class C3ReversingAndPalindromicThinking {
    //1. Reverse a string without using built-in reverse.
    private static String reverse(String str) {
        if (str == null || str.isBlank()) return str;

        StringBuilder sb = new StringBuilder();

        for (int i = str.length()-1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    //2. Reverse each word in a sentence.
    private static String reverseEachWord(String str) {
        if (str == null || str.isBlank()) return str;

        String[] words = str.split(" ");
        for (int i=0 ; i<words.length ; i++) {
            words[i] = reverse(words[i]);
        }

        return String.join(" ", words);
    }

    //3. Reverse the order of words in a sentence.
    private static String reverseOrderOfWords(String str) {
        if (str == null || str.isBlank()) return str;

        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");
        for (int i=words.length-1 ; i>=0 ; i--) {
            sb.append(" ").append(words[i]);
        }

        return sb.substring(1);
    }

    //4. Check whether a string is a palindrome.
    private static boolean isPalindrome(String str) {
        if (str == null || str.isBlank()) return true;

        int s=0, e=str.length()-1;
        while (e>s) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }

        return true;
    }

    //5. Check if two strings are the reverse of each other.
    private static boolean checkReverseToEachOther(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        return str1.equals(reverse(str2)) || str2.equals(reverse(str1));
    }

    //6. Print the middle character(s) of a string.
    private static void printMidChar(String str) {
        if (str == null || str.isEmpty()) return;
        int strLen = str.length();
        System.out.println(str.charAt(strLen/2-1) + (strLen%2 == 0 ? "" + str.charAt(strLen/2) : ""));
    }

    //7. Print the second half of the string in reverse.
    private static void secondHalfInReverse(String str) {
        if (str == null) return;
        if (str.isEmpty()) {
            System.out.println(str);
            return;
        }

        int strLen = str.length();
        String firstHalf = str.substring(0,strLen/2);
        String secondHalf = str.substring(strLen/2);

        System.out.println(firstHalf+reverse(secondHalf));
    }

    //8. Remove the first and last character and print the remaining string.
    private static void removefirstLast(String str) {
        if (str == null || str.length() <2) return;

        System.out.println(str.substring(1,str.length()-1));
    }

    //9. Reverse only characters, keeping digits in place.
    private static String reverseOnlyCharacters(String str) {
        if (str == null || str.isBlank()) return str;

        char[] charArr = str.toCharArray();

        int s=0,e=charArr.length-1;

        while (s<e) {
            if (Character.isDigit(charArr[s])) {
                s++;
                continue;
            }
            else if (Character.isDigit(charArr[e])) {
                e--;
                continue;
            }
            // Swap
            char temp = charArr[s];
            charArr[s] = charArr[e];
            charArr[e] = temp;
            s++;
            e--;
        }

        return new String(charArr);
    }

    //10. Reverse string but skip spaces.
    private static String reverseStrButKeepSpaces(String str) {
        if (str == null || str.isBlank()) return str;

        char[] charArr = str.toCharArray();

        int s=0,e=charArr.length-1;

        while (s<e) {
            if (Character.isSpaceChar(charArr[s])) {
                s++;
                continue;
            }
            else if (Character.isSpaceChar(charArr[e])) {
                e--;
                continue;
            }
            // Swap
            char temp = charArr[s];
            charArr[s] = charArr[e];
            charArr[e] = temp;
            s++;
            e--;
        }

        return new String(charArr);
    }
}
