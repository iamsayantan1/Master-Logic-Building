package com.sayantandas.masterlogicbuildingpdf.p5strings;

public class C5WordLevelThinking {
    //1. Print each word of a sentence on a new line.
    private static void printWordInNewLine(String str) {
        if (str == null) return;

        String[] words = str.split(" ");

        for (String word : words) {
            if (!word.isBlank()) {
                System.out.println(word);
            }
        }
    }

    //2. Count how many words have even length.
    private static int countWordsWithEvenLength(String str) {
        if (str == null || str.isBlank()) return 0;

        int count=0;

        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isBlank()) {
                if (word.length()%2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    //3. Find the longest word in a sentence.
    private static String longestWord(String str) {
        if (str == null || str.isBlank()) return str;

        int maxLen=0;
        String maxStr=null;

        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isBlank()) {
                if (word.length()>maxLen) {
                    maxLen=word.length();
                    maxStr=word;
                }
            }
        }

        return maxStr;
    }

    //4. Find the shortest word in a sentence.
    private static String shortestWord(String str) {
        if (str == null || str.isBlank()) return str;

        int minLen=Integer.MAX_VALUE;
        String minStr=null;

        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isBlank()) {
                if (word.length()<minLen) {
                    minLen=word.length();
                    minStr=word;
                }
            }
        }

        return minStr;
    }

    //5. Swap first and last words in a sentence.
    private static String swapFirstAndLastWord(String str) {
        if (str == null || str.isBlank()) return str;

        String[] words = str.trim().split(" ");

        // Swap
        String temp = words[0];
        words[0] = words[words.length-1];
        words[words.length-1] = temp;

        return String.join(" ", words);
    }

    //6. Print all words that start and end with the same letter.
    private static void printWordsWithSameStartingAndEndingChar(String str) {
        if (str == null || str.isBlank()) return;

        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isBlank()) {
                if (word.charAt(0) == word.charAt(word.length()-1)) {
                    System.out.println(word);
                }
            }
        }
    }

    //7. Count how many words contain the letter ‘a’.
    private static int noOfWordsContainingA(String str) {
        if (str == null || str.isBlank()) return 0;

        int count=0;

        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isBlank()) {
                if (word.contains("a")) {
                    count++;
                }
            }
        }

        return count;
    }

    //8. Capitalize the first letter of each word.
    private static String capitalizeFirstLetterForEachWord(String str) {
        if (str == null || str.isBlank()) return str;

        String[] words = str.split(" ");
        for (int i=0 ; i<words.length ; i++) {
            if (!words[i].isBlank()) {
                int len = words[i].length();
                if (len==1) {
                    words[i] = words[i].toUpperCase();
                }
                else {
                    words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1,len);
                }
            }
        }

        return String.join(" ", words);
    }

    //9. Print the sentence in title case (first letter capital, rest lowercase).
    private static void printInTitleCase(String str) {
        if (str == null) return;

        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isBlank()) {
                if (word.length() ==1) {
                    System.out.print(Character.toUpperCase(word.charAt(0)) + " ");
                }
                else {
                    System.out.print(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + " ");
                }
            }
        }
    }

    //10. Remove extra spaces between words (normalize spacing).
    private static String removeXtraSpaces(String str) {
        if (str == null || str.isBlank()) return str;

        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isBlank()) {
                sb.append(" ").append(word);
            }
        }

        return sb.substring(1);
    }
}
