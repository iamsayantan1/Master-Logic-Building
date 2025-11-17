package com.sayantandas.masterlogicbuildingpdf.p5strings;

import java.util.HashMap;
import java.util.Map;

public class C2CountingAndCharacterAnalysis {
    //1. Count how many vowels and consonants are in a string.
    private static void countVowelConsonant(String str) {
        int vowel=0, consonant=0;
        if (str == null) return;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowel++;
                }
                else {
                    consonant++;
                }
            }
        }

        System.out.println("Vowels: " + vowel + ", Consonants: " + consonant);
    }

    //2. Count the number of digits, letters, and special characters in a string.
    private static void countDigitsLettersSpecialChars(String str) {
        int digits=0, letters=0, spchars=0;
        if (str == null) return;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits++;
            }
            else if (Character.isLetter(ch)) {
                letters++;
            }
            else {
                spchars++;
            }
        }

        System.out.println("Digits: " + digits + ", Letters: " + letters + ", Special Characters: " + spchars);
    }

    //3. Count how many uppercase and lowercase letters a string has.
    private static void countUpperCaseLowerCase(String str) {
        int ucase=0, lcase=0;
        if (str == null) return;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    ucase++;
                }
                else {
                    lcase++;
                }
            }
        }

        System.out.println("Uppercase: " + ucase + ", Lowercase: " + lcase);
    }

    //4. Find the frequency of each character in a string (without using a map).
    private static void frequencyOfEachChar(String str) {
        if (str == null) return;
        Map<Character,Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    //5. Count how many spaces are there in a sentence.
    private static int countSpaces(String str) {
        if (str == null) return 0;
        int spaces=0;

        for (char ch : str.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                spaces++;
            }
        }

        return spaces;
    }

    //6. Count how many times a given character appears in a string.
    private static int countCharFrequency(String str, char givenChar) {
        if (str == null) return 0;
        int givenCharNo=0;

        for (char ch : str.toCharArray()) {
            if (givenChar == ch) {
                givenCharNo++;
            }
        }

        return givenCharNo;
    }

    //7. Count how many alphabets are before ‘m’ and after ‘m’ in a given string.
    private static void countAlphabetsBeforeAndAfterM(String str) {
        if (str == null) return;
        int beforeM=0, afterM=0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    if (ch>'M') {
                        afterM++;
                    }
                    else if (ch<'M') {
                        beforeM++;
                    }
                }
                else {
                    if (ch>'m') {
                        afterM++;
                    }
                    else if (ch<'m') {
                        beforeM++;
                    }
                }
            }
        }

        System.out.println("Before M: " + beforeM + ", After M: " + afterM);
    }

    //8. Count how many substrings start and end with the same character (simple logic).
    private static int countSubstring(String str) {
        if (str == null) return 0;
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String s = str.substring(i,j);
                if (s.charAt(0) == s.charAt(s.length()-1)) {
                    count++;
                }
            }
        }

        return count;
    }

    //9. Print how many words start with a vowel in a sentence.
    private static int countWordsStartsWithVowel(String str) {
        if (str == null) return 0;
        String[] words = str.split(" ");
        int countSWVowel=0;

        for (String word : words) {
            if (!word.isEmpty() && "aeiouAEIOU".indexOf(word.charAt(0)) != -1) {
                countSWVowel++;
            }
        }

        return countSWVowel;
    }

    //10. Count how many words end with ‘s’.
    private static int countWordsEndsWithS(String str) {
        if (str == null) return 0;
        String[] words = str.split(" ");
        int countEWS=0;

        for (String word : words) {
            if (word.endsWith("s")) {
                countEWS++;
            }
        }

        return countEWS;
    }
}
