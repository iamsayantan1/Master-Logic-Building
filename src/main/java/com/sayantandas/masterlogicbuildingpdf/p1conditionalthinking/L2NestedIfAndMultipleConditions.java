package com.sayantandas.masterlogicbuildingpdf.p1conditionalthinking;

public class L2NestedIfAndMultipleConditions {
    public static void main(String[] args) {
        // 1. Take three sides and check if they form a valid triangle.
        int[][] sideSets = {
                {3, 4, 5},   // valid right-angled triangle
                {5, 5, 5},   // valid equilateral triangle
                {5, 5, 8},   // valid isosceles triangle
                {2, 3, 6},   // invalid, does not satisfy triangle inequality
                {1, 2, 3},   // invalid, just equals third side (not greater)
                {10, 1, 1},  // invalid, sum of small sides is less than largest
                {7, 10, 16}  // valid (7+10>16)
        };

        for (int i = 0; i < sideSets.length; i++) {
            int a = sideSets[i][0];
            int b = sideSets[i][1];
            int c = sideSets[i][2];
            System.out.println("(" + a + ", " + b + ", " + c + ") => " + (validTriangle(a,b,c) ? "Valid Triangle" : "Invalid Triangle"));
        }

        // 2. If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
        int[][] sidesArr = {
                {3, 4, 5},   // scalene triangle
                {5, 5, 5},   // equilateral triangle
                {5, 5, 8},   // isosceles triangle
                {2, 3, 6},   // invalid triangle
                {10, 1, 1},  // invalid triangle (fails inequality)
                {7, 10, 16}, // valid scalene
                {50, 50, 99},// nearly isosceles but invalid (sum of two sides = 99, equals third)
                {6, 6, 10}   // valid isosceles
        };

        for (int i = 0; i < sidesArr.length; i++) {
            int a = sidesArr[i][0];
            int b = sidesArr[i][1];
            int c = sidesArr[i][2];
            System.out.println("(" + a + ", " + b + ", " + c + ") -> " + triangleType(a, b, c));
        }

        // 3. Take marks (0–100) and print the corresponding grade (A/B/C/D/F).
        int[] marksArr = {100, 99, 90, 89, 80, 79, 70, 69, 50, 49, 0, -5, 105};
        for (int i = 0; i < marksArr.length; i++) {
            System.out.println("Marks: " + marksArr[i] + " => Grade: " + grade(marksArr[i]));
        }

        // 4. Check if one of two given numbers is a multiple of the other.
        int[][] numPairs = {
                {10, 5},   // 10 is a multiple of 5
                {15, 3},   // 15 is a multiple of 3
                {9, 4},    // not multiple
                {7, 14},   // 14 is multiple of 7
                {0, 5},    // edge case: 0 divisible by any nonzero number
                {5, 0},    // edge case: division by 0 (should be handled gracefully)
                {12, 6},   // 12 multiple of 6
                {25, 5},   // 25 multiple of 5
                {18, 9},   // 18 multiple of 9
                {8, 3}     // not multiple
        };

        for (int i = 0; i < numPairs.length; i++) {
            int a = numPairs[i][0];
            int b = numPairs[i][1];
            System.out.print("Numbers: (" + a + ", " + b + ") => ");
            if (b == 0 || a == 0) {
                System.out.println("Special case (division by zero or zero input)");
            } else {
                multipleOfOther(a, b);
            }
        }

        // 5. Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”.
        int[] hourArr = {0, 4, 5, 8, 11, 12, 15, 17, 18, 20, 21, 23, 24, 25, -1};
        for (int i = 0; i < hourArr.length; i++) {
            System.out.print("Hour: " + hourArr[i] + " => ");
            greetbyTime(hourArr[i]);
        }

        // 6. Check voting eligibility for a given age (18+).
        int[] ages = {-5, 0, 10, 17, 18, 19, 25, 60, 120};
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Age: " + ages[i] + " => Voting Eligible? " + votingEligibility(ages[i]));
        }

        // 7. Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.
        int[][] numPairs2 = {
                {2, 4},   // both even
                {3, 9},   // both odd
                {2, 9},   // one even, one odd
                {7, 6},   // one odd, one even
                {0, 8},   // 0 is even — both even
                {5, 0},   // one odd, one even
                {-2, -4}, // both even negative
                {-3, -7}, // both odd negative
                {-3, 8}   // one odd negative, one even positive
        };

        for (int i = 0; i < numPairs2.length; i++) {
            int a = numPairs2[i][0];
            int b = numPairs2[i][1];
            System.out.print("(" + a + ", " + b + ") => ");
            printEvenOdd(a, b);
        }

        // 8. Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
        char[] charArr = {'a', 'm', 'n', 'z', 'A', 'M', 'N', 'Z', '1', '*', 'k', 'p'};
        for (int i = 0; i < charArr.length; i++) {
            System.out.print("Character: " + charArr[i] + " => ");
            betweenAandMorNandZ(charArr[i]);
        }

        // 9. Take a day number (1–7) and print the corresponding day name.
        int[] dayNumbers = {1, 2, 3, 4, 5, 6, 7, 0, 8, -2, 10};
        for (int i = 0; i < dayNumbers.length; i++) {
            System.out.println("Day No: " + dayNumbers[i] + " => " + weekdayName(dayNumbers[i]));
        }

        // 10. Take a month number (1–12) and print the number of days in that month (ignore leap years).
        int[] monthArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 13, -1};
        for (int i = 0; i < monthArr.length; i++) {
            System.out.println("Month: " + monthArr[i] + " => Days: " + noOfDaysInMonth(monthArr[i]));
        }
    }

    /**
     * 1. Take three sides and check if they form a valid triangle.
     * @param arm1
     * @param arm2
     * @param arm3
     * @return
     */
    private static boolean validTriangle(int arm1, int arm2, int arm3) {
        /*int max = Math.max(arm1,Math.max(arm2,arm3));
        return (arm1+arm2+arm3 - max) > max;*/

        return (arm1 + arm2 > arm3) && (arm1 + arm3 > arm2) && (arm2 + arm3 > arm1);
    }

    /**
     * 2. If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
     * @param arm1
     * @param arm2
     * @param arm3
     * @return
     */
    private static String triangleType(int arm1, int arm2, int arm3) {
        if (!validTriangle(arm1,arm2,arm3)) {
            return "Invalid triangle.";
        }

        if (arm1 == arm2 && arm2 == arm3) {
            return "Equilateral triangle.";
        }
        else if (arm1 == arm2 || arm2 == arm3 || arm1 == arm3) {
            return "Isosceles triangle.";
        }
        else {
            return "Scalene triangle.";
        }
    }

    /**
     * 3. Take marks (0–100) and print the corresponding grade (A/B/C/D/F).
     * @param marks
     */
    private static String grade(int marks) {
        if (marks>100 || marks<0) {
            return "Invalid marks";
        }
        else if (marks >= 90) {
            return "A";
        }
        else if (marks >= 80) {
            return "B";
        }
        else if (marks >= 70) {
            return "C";
        }
        else if (marks >= 50) {
            return "D";
        }
        else {
            return "F";
        }
    }

    /**
     * 4. Check if one of two given numbers is a multiple of the other.
     * @param number1
     * @param number2
     */
    private static void multipleOfOther(int number1, int number2) {
        int max = Math.max(number1,number2);
        int min = Math.min(number1,number2);

        System.out.println(max%min==0 ? (max + " is multiple of " + min) : (max + " is not multiple of " + min));
    }

    /**
     * 5. Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”.
     * @param hour
     */
    private static void greetbyTime(int hour) {
        hour %=24;

        if (hour<0) {
            System.out.println("Invalid hour.");
        }
        else if (hour>=5 && hour<12) {
            System.out.println("Good Morning.");
        }
        else if (hour>=12 && hour<18) {
            System.out.println("Good Afternoon.");
        }
        else if (hour>=18 && hour<21) {
            System.out.println("Good Evening.");
        }
        else {
            System.out.println("Good Night.");
        }
    }

    /**
     * 6. Check voting eligibility for a given age (18+).
     * @param age
     * @return
     */
    private static boolean votingEligibility(int age) {
        return age >= 18;
    }

    /**
     * 7. Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.
     * @param number1
     * @param number2
     */
    private static void printEvenOdd(int number1, int number2) {
        boolean even1 = number1%2 == 0;
        boolean even2 = number2%2 == 0;

        if (even1 && even2) {
            System.out.println(number1 + " and " + number2 + " both are even.");
        }
        else if (!even1 && !even2) {
            System.out.println(number1 + " and " + number2 + " both are odd.");
        }
        else {
            System.out.println("One is even and one is odd.");
        }
    }

    /**
     * 8. Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
     * @param alphabet
     */
    private static void betweenAandMorNandZ(char alphabet) {
        if (alphabet >= 'a' && alphabet <= 'm') {
            System.out.println(alphabet + " character is lies between ‘a’ and ‘m’");
        }
        else if (alphabet >= 'n' && alphabet <= 'z') {
            System.out.println(alphabet + " character is lies between ‘n’ and ‘z’");
        }
        else {
            System.out.println(alphabet + " character is not lies between ‘a’ and ‘z’");
        }
    }

    /**
     * 9. Take a day number (1–7) and print the corresponding day name.
     * @param dayNo
     */
    private static String weekdayName(int dayNo) {
        return switch(dayNo) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day number.";
        };
    }

    /**
     * 10. Take a month number (1–12) and print the number of days in that month (ignore leap years).
     * @param monthNo
     */
    private static int noOfDaysInMonth(int monthNo) {
        return switch (monthNo) {
            case 2 -> 28;
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            default -> -1;
        };
    }
}
