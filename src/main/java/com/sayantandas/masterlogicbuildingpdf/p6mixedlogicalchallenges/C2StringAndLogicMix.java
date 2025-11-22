package com.sayantandas.masterlogicbuildingpdf.p6mixedlogicalchallenges;

import java.util.*;

public class C2StringAndLogicMix {
    //1. Check if two strings are anagrams (without using collections).
    private static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) return false;

        int str1Len = str1.length();
        int str2Len = str2.length();

        if (str1Len != str2Len) {
            return false;
        }

        boolean[] str2Marker = new boolean[str2Len];
        for (int i = 0; i < str1Len; i++) {
            boolean notFound = true;
            char ch = str1.charAt(i);

            for (int j = 0; j < str2Len; j++) {
                if (str2.charAt(j) == ch && !str2Marker[j]) {
                    str2Marker[j] = true;
                    notFound = false;
                    break;
                }
            }

            if (notFound) {
                return false;
            }
        }

        return true;
    }

    //2. Count vowels in each word of a sentence.
    private static Map<String,Integer> noOfVowelInEachWord(String sentence) {
        if (sentence == null) return null;
        Map<String,Integer> vowelFrequencyInWord = new HashMap<>();

        String[] words = sentence.split("[\\s,;:\\-()\"']+");

        for (String word : words) {
            vowelFrequencyInWord.put(word,countVowelInWord(word));
        }

        return vowelFrequencyInWord;
    }

    private static int countVowelInWord(String word) {
        if (word == null) return 0;
        char[] charArr = word.toCharArray();

        int vowelCount = 0;
        for(char ch : charArr) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    //3. Reverse words in a string if their length is even.
    private static String reverseWordOnCondition(String sentence) {
        if (sentence == null) return null;
        StringBuilder sbSentence = new StringBuilder(sentence);
        String separators = " ,;:-()\"'\t\n";

        int sentenceLen = sbSentence.length();
        int start=0, end=0;
        for (int i = 0; i < sentenceLen; i++) {
            char ch = sbSentence.charAt(i);

            if (separators.indexOf(ch) != -1) {
                String word = sbSentence.substring(start,end);
                if (word.length()%2 == 0) {
                    word = new StringBuilder(word).reverse().toString();
                    sbSentence.replace(start,end, word);
                }

                start = end = i+1;
            }
            else {
                end++;
            }
        }

        if (end != start) {
            String word = sbSentence.substring(start,end);
            if (word.length()%2 == 0) {
                word = new StringBuilder(word).reverse().toString();
                sbSentence.replace(start,end, word);
            }
        }

        return sbSentence.toString();
    }

    //4. Replace every vowel in a string with its position (a=1, e=2...).
    private static String replaceVowelByPosition(String sentence) {
        if (sentence == null) return null;
        String vowels = "aeiouAEIOU";
        StringBuilder sbSentence = new StringBuilder(sentence);
        int sentenceLen = sbSentence.length();
        for (int i = 0; i <sentenceLen; i++) {
            char ch = sbSentence.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                sbSentence.replace(i,i+1,String.valueOf(vowels.indexOf(ch)%5+1));
            }
        }

        return sbSentence.toString();
    }

    //5. Print characters that appear more than once (without map).
    private static void printMultpleAvailableChars(String sentence) {
        if (sentence == null) return;
        Set<Character> totalCharSet = new HashSet<>();
        Set<Character> nonUniqueCharSet = new HashSet<>();

        char[] sentenceChars = sentence.toCharArray();

        for (char ch : sentenceChars) {
            if (totalCharSet.contains(ch)) {
                nonUniqueCharSet.add(ch);
            }
            totalCharSet.add(ch);
        }

        System.out.print("Non unique characters are:");
        for(char ch : nonUniqueCharSet) {
            System.out.print(" " + ch);
        }
        System.out.println();
    }

    //6. Count words that start and end with the same letter.
    private static int countWordsStartEndWithSameLetter(String sentence) {
        if (sentence == null) return 0;

        String[] words = sentence.split("[\\s,;:\\-()\"']+");

        int countWord=0;
        for (String word : words) {
            if (word.charAt(0) == word.charAt(word.length()-1)) {
                countWord++;
            }
        }

        return countWord;
    }

    //7. Toggle case for every alternate word in a sentence.
    private static String toggleCaseForAlternateWord(String sentence) {
        if (sentence == null) return null;
        boolean isUpperCase = false;

        StringBuilder sbSentence = new StringBuilder(sentence);
        String separators = " ,;:-()\"'\t\n";

        int sentenceLen = sbSentence.length();
        int start=0, end=0;
        for (int i = 0; i < sentenceLen; i++) {
            char ch = sbSentence.charAt(i);

            if (separators.indexOf(ch) != -1) {
                String word = sbSentence.substring(start,end);
                if (word.length()%2 == 0) {
                    word = isUpperCase ? word.toUpperCase() : word.toLowerCase();
                    sbSentence.replace(start,end, word);
                    isUpperCase = !isUpperCase;
                }

                start = end = i+1;
            }
            else {
                end++;
            }
        }

        if (end != start) {
            String word = sbSentence.substring(start,end);
            if (word.length()%2 == 0) {
                word = isUpperCase ? word.toUpperCase() : word.toLowerCase();
                sbSentence.replace(start,end, word);
            }
        }

        return sbSentence.toString();
    }

    //8. Check if two strings are rotations of each other.
    private static boolean isRotationOfeachOther(String str1, String str2) {
        if (str1 == null || str2 == null || str1.isBlank() || str2.isBlank()) return false;

        int str1Len = str1.length();
        int str2Len = str2.length();
        if (str1Len != str2Len) return false;

        char firstCharOf2ndStr = str2.charAt(0);
        int indexOfCharIn1stStr = str1.indexOf(firstCharOf2ndStr);
        if (indexOfCharIn1stStr == -1) return false;


        for (int i = 1; i < str2Len; i++) {
            indexOfCharIn1stStr = ++indexOfCharIn1stStr % str1Len;
            if (str2.charAt(i) != str1.charAt(indexOfCharIn1stStr)) {
                return false;
            }
        }

        return true;
    }

    //9. Find the word with maximum vowels in a sentence.
    private static String wordWithMaxVowels(String sentence) {
        if (sentence == null) return null;
        Map<String,Integer> vowelFrequencyInWord = new HashMap<>();

        String[] words = sentence.split("[\\s,;:\\-()\"']+");

        for (String word : words) {
            vowelFrequencyInWord.put(word,countVowelInWord(word));
        }

        int maxVowelCount = -1;
        String maxVowelContainsStr = null;
        for (Map.Entry<String,Integer> item : vowelFrequencyInWord.entrySet()) {
            if (maxVowelCount<item.getValue()) {
                maxVowelCount = item.getValue();
                maxVowelContainsStr = item.getKey();
            }
        }

        return maxVowelContainsStr;
    }

    //10. Remove duplicate words from a sentence.
    private static String removeDuplicateWords(String sentence) {
        String[] words = sentence.split(" ");

        Set<String> setWords = new LinkedHashSet<>(List.of(words));

        return String.join(" ", setWords);
    }
}
