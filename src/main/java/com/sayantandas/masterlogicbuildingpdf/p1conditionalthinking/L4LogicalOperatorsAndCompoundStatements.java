package com.sayantandas.masterlogicbuildingpdf.p1conditionalthinking;

import java.sql.Time;

public class L4LogicalOperatorsAndCompoundStatements {

    // 1. Take a character and check if it is a letter, a digit, or neither.
    private static String checkCharacter(char charecter) {
        if (Character.isLetter(charecter)) {
            return "Letter";
        } else if (Character.isDigit(charecter)) {
            return "Digit";
        } else {
            return "Neither";
        }
    }

    // 2. Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and “FizzBuzz” if divisible by both.
    private static String fizzBuzz(int n) {
        boolean fizz = (n%3 == 0);
        boolean buzz = (n%5 == 0);
        if (fizz && buzz) {
            return "FizzBuzz";
        } else if (fizz) {
            return "Fizz";
        } else if (buzz) {
            return "Buzz";
        } else {
            return "";
        }
    }

    // 3. Take three numbers and print the median value (neither maximum nor minimum).
    private static int findMedian(int a, int b, int c) {
        int min = Math.min(a,Math.min(b,c));
        int max = Math.max(a,Math.max(b,c));

        return a+b+c - max - min;
    }

    // 4. Take 24-hour time (hours and minutes) and print whether it is AM or PM.
    private static String amPm(String time) {
        if (time != null) {
            int delimiter = time.indexOf(":");
            if (delimiter == 2) {
                try {
                    int hour = Integer.parseInt(time.substring(0, delimiter));
                    int minute = Integer.parseInt(time.substring(delimiter + 1));

                    if ((hour >= 0 && hour<24) && (minute >= 0 && minute < 60)) {
                        if (hour < 12) {
                            return "AM";
                        }
                        else {
                            return "PM";
                        }
                    }
                } catch (NumberFormatException | IndexOutOfBoundsException ignore) {}
            }
        }

        return "Invalid Time Format";
    }

    // 5. Take income and age, and check if eligible for tax (age > 18 and income > 5 L).
    private static boolean taxEligibility(int age, float income) {
        if (age >= 18 && income >= 500000) {
            return true;
        }
        return false;
    }

    // 6. Take two numbers and check if both are positive and their sum is less than 100.
    private static boolean check2Numbers(int num1, int num2) {
        if (num1 >= 0 && num2 >= 0 && (num1+num2 < 100)) {
            return true;
        }
        return false;
    }

    // 7. Take a single digit (0–9) and print its word form (“Zero” to “Nine”).
    private static String singleDigit(int n) {
        if (n>=0 && n<=9) {
            return switch (n) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "";
            };
        }

        return "Invalid input";
    }

    // 8. Take a weekday number (1–7) and determine if it is a weekday or weekend.
    private static String checkWeekDayOrEnd(int n) {
        if (n>=1 && n<=7) {
            if (n==1 || n==7) {
                return "Weekend";
            }
            else {
                return "Weekday";
            }
        }

        return "Invalid input";
    }

    // 9. Take electricity units consumed and calculate the bill as per slabs (using if-else).

    // 10. Take a password string and check basic rules (length ≥ 8 and contains at least one digit).
    private static boolean passwordValidity(String password) {
        if (password.length() >= 8) {
            char[] passwordCharArr = password.toCharArray();

            for(char elem : passwordCharArr) {
                if (Character.isDigit(elem)) {
                    return true;
                }
            }
        }

        return false;
    }
}
