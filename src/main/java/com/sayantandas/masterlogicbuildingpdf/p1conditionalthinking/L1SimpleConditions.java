package com.sayantandas.masterlogicbuildingpdf.p1conditionalthinking;

/**
 * Phase 1 – Conditional Thinking (If–Else, Boolean Logic)
 *
 * 🎯Goal: Understand how to make decisions using conditions.
 * Topics covered: Relational operators, logical operators, nested if, multiple conditions. Target Questions: 50
 */

public class L1SimpleConditions {
    public static void main(String[] args) {
        // 1. Take a number and print whether it’s positive, negative, or zero.
        int[] numArr = {-3, -5, 0, 19, 10};
        for (int i = 0; i < numArr.length; i++) {
            posNegOrZero(numArr[i]);
        }

        // 2. Check if a number is even or odd.
        for (int i = 0; i < numArr.length; i++) {
            evenOdd(numArr[i]);
        }

        // 3. Check if a number is divisible by 5.
        for (int i = 0; i < numArr.length; i++) {
            divisibleBy5(numArr[i]);
        }

        // 4. Check if a number is divisible by both 3 and 5.
        for (int i = 0; i < numArr.length; i++) {
            divisibleBy3And5(numArr[i]);
        }

        // 5. Check if a given year is a leap year.
        int[] years = {1900, 2000, 2020, 2021, 2100};
        for (int i = 0; i < years.length; i++) {
            leapYear(years[i]);
        }

        // 6. Take two numbers and print the larger one.
        int[][] pairs2 = {{5, 9}, {12, 12}, {-1, -5}, {0, 7}};
        for (int i = 0; i < pairs2.length; i++) {
            largerBW2(pairs2[i][0], pairs2[i][1]);
        }

        // 7. Take three numbers and print the largest.
        int[][] triples = {{5, 9, 3}, {12, 12, 12}, {-1, -5, -3}, {10, 2, 30}};
        for (int i = 0; i < triples.length; i++) {
            largerBW3(triples[i][0], triples[i][1], triples[i][2]);
        }

        // 8. Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
        int[] temps = {15, 20, 25, 30, 35};
        for (int i = 0; i < temps.length; i++) {
            coldWarmHotByTemperature(temps[i]);
        }

        // 9. Take a character and check if it’s a vowel or consonant.
        char[] alphabets = {'a', 'b', 'e', 'z', 'u'};
        for (int i = 0; i < alphabets.length; i++) {
            vowelOrConsonant(alphabets[i]);
        }

        // 10. Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.
        char[] chars = {'a', 'Z', '9', '#', 'm'};
        for (int i = 0; i < chars.length; i++) {
            uCaseLCaseDigitSpacialChar(chars[i]);
        }
    }

    /**
     * 1. Take a number and print whether it’s positive, negative, or zero.
     * @param number
     */
    private static void posNegOrZero(int number) {
        System.out.println(number + " is " + (number == 0 ? "Zero" : (number>0 ? "Positive" : "Negative")));
    }

    /**
     * 2. Check if a number is even or odd.
     * @param number
     */
    private static void evenOdd(int number) {
        System.out.println(number + " is " + ((number & 1) == 0 ? "Even" : "Odd"));
    }

    /**
     * 3. Check if a number is divisible by 5.
     * @param number
     */
    private static void divisibleBy5(int number) {
        System.out.println(number + " is " + (number%5 == 0 ? "" : "Not ") + "Divisible by 5");
    }

    /**
     * 4. Check if a number is divisible by both 3 and 5.
     * @param number
     */
    private static void divisibleBy3And5(int number) {
        System.out.println(number + " is " + (((number%3 == 0) && (number%5 == 0) ? "" : "Not ") + "Divisible by 3 and 5"));
    }

    /**
     * 5. Check if a given year is a leap year.
     * @param year
     */
    private static void leapYear(int year) {
        String message = "";

        // If year is a century(divisible by 100) then if it's divisible by 400 then it's a leap year, if year is not a century, then check if it's divisible by 4
        if (year%100 == 0) {
            if (year%400 != 0) {
                message = "not ";
            }
        }
        else {
            if (year%4 != 0) {
                message = "not ";
            }
        }

        // Print message
        System.out.println(year + " is " + message + "a leap year.");
    }

    /**
     * 6. Take two numbers and print the larger one.
     * @param num1
     * @param num2
     */
    private static void largerBW2(int num1, int num2) {
        System.out.println("Between " + num1 + " and " + num2 + ", " + (num1 == num2 ? "both are equal" : ((num1>num2 ? num1:num2) + " is larger.")));
    }

    /**
     * 7. Take three numbers and print the largest.
     * @param num1
     * @param num2
     * @param num3
     */
    private static void largerBW3(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            System.out.println("Between " + num1 + ", " + num2 + " and " + num3 + ", " + "three numbers are equal.");
        }
        else {
            System.out.println("Between " + num1 + ", " + num2 + " and " + num3 + ", " + (((num1>num2 && num1>num3) ? num1 : (num2>num3 ? num2 : num3)) + " is greater."));
        }
    }

    /**
     * 8. Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
     * @param temperature
     */
    private static void coldWarmHotByTemperature(int temperature) {
        String tempStatus;
        if (temperature < 20) {
            tempStatus = "cold";
        }
        else if(temperature >= 20 && temperature <= 30) {
            tempStatus = "warm";
        }
        else {
            tempStatus = "hot";
        }

        System.out.println("Temperature is " + temperature + " ゜C and it is " + tempStatus + " now.");
    }

    /**
     * 9. Take a character and check if it’s a vowel or consonant.
     * @param alphabet
     */
    private static void vowelOrConsonant(char alphabet) {
        System.out.println(alphabet + " is " + ("aeiou".indexOf(alphabet) >= 0 ? "vowel" : "consonant"));
    }

    /**
     * 10. Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.
     * @param character
     */
    private static void uCaseLCaseDigitSpacialChar(char character) {
        String charStatus;

        if (Character.isLowerCase(character)) {
            charStatus = "Lower Case";
        }
        else if (Character.isUpperCase(character)) {
            charStatus = "Upper Case";
        }
        else if (Character.isDigit(character)) {
            charStatus = "Digit";
        }
        else {
            charStatus = "Spacial Character";
        }

        System.out.println(character + " is a " + charStatus);
    }
}
