package com.sayantandas.masterlogicbuildingpdf.p5strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class C4CharacterAndWordManipulation {
    //1. Remove all vowels from a string.
    private static String removeVowels(String str) {
        if (str == null || str.isBlank()) return str;

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                continue;
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    //2. Remove all spaces from a string.
    private static String removeSpaces(String str) {
        if (str == null || str.isBlank()) return str;

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if (Character.isSpaceChar(ch)) {
                continue;
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    //3. Replace all vowels with ‘*’.
    private static String replaceVowels(String str) {
        if (str == null || str.isBlank()) return str;

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                sb.append('*');
            }
            else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    //4. Replace all spaces with ‘_’.
    private static String replaceSpaces(String str) {
        if (str == null || str.isBlank()) return str;

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if (Character.isSpaceChar(ch)) {
                sb.append('_');
            }
            else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    //5. Print the string after removing all digits.
    private static void removeDigitAndPrint(String str) {
        if (str == null || str.isBlank()) return;

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                continue;
            }
            sb.append(ch);
        }

        System.out.println(sb);
    }

    //6. Remove duplicate characters from a string.
    private static String removeDuplicates(String str) {
        if (str == null || str.isBlank()) return str;

        char[] chars = str.toCharArray();
        Set<Character> unique = new LinkedHashSet<>();
        for (char ch : chars) {
            unique.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : unique) {
            sb.append(ch);
        }

        return sb.toString();
    }

    //7. Keep only the first occurrence of each character.
    private static String keepFirstOccurence(String str) {
        return removeDuplicates(str);
    }

    //8. Remove consecutive duplicate characters (e.g., “aaabb” → “ab”).
    private static String removeConsecutiveDuplicates(String str) {
        if (str == null || str.isBlank()) return str;

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        char prevChar = chars[0];
        sb.append(prevChar);
        for (int i=1 ; i<chars.length ; i++) {
            if (prevChar==chars[i]) {
                continue;
            }
            prevChar=chars[i];
            sb.append(prevChar);
        }

        return sb.toString();
    }

    //9. Swap case: uppercase → lowercase and lowercase → uppercase.
    private static String swapCase(String str) {
        if (str == null || str.isBlank()) return str;

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
            else {
                sb.append(Character.toUpperCase(ch));
            }
        }

        return sb.toString();
    }

    //10. Shift each character by 1 (e.g., “abc” → “bcd”).
    private static String shiftCharacter(String str) {
        if (str == null || str.isBlank()) return str;

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            sb.append(++ch);
        }

        return sb.toString();
    }
}
