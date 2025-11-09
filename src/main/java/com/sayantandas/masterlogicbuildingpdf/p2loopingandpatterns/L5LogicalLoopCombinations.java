package com.sayantandas.masterlogicbuildingpdf.p2loopingandpatterns;

public class L5LogicalLoopCombinations {
    //1. Print all numbers whose sum of digits is even (1–100).
    private static void printNumWithEvenSumOfDigit(int n) {
        for (int no = 1; no <= 100; no++) {
            int sod = sumOfDigits(no);
            if ((sod&1) == 0) {
                System.out.print(no + " ");
            }
        }
    }

    private static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n%10 + sumOfDigits(n/10);
    }

    //2. Count how many numbers between 1–500 are divisible by 7 but not by 5.
    private static int divBy7NotBy5Upto500() {
        int count=0;

        for (int no = 1; no <= 500; no++) {
            if (no%7 == 0 && no%5 != 0) {
                count++;
            }
        }

        return count;
    }

    //3. Print all numbers that are palindromes between 1–500.
    private static void printPalindromeUpto500() {
        for (int no = 1; no <= 500; no++) {
            if (isPalindrome(no)) {
                System.out.print(no + " ");
            }
        }
    }

    private static boolean isPalindrome(int n) {
        return reverse(n) == n;
    }

    private static int reverse(int n) {
        int reverse=0;

        while (n!=0) {
            reverse = reverse*10 + n%10;
            n /= 10;
        }

        return reverse;
    }

    //4. Print numbers between 1–100 whose digits add up to a multiple of 3.
    private static void printSumOfDigitDivBy3() {
        for (int no = 1; no <= 100; no++) {
            if (sumOfDigits(no)%3 == 0) {
                System.out.print(no + " ");
            }
        }
    }

    //5. Find the smallest and largest digit in a given number.
    private static void printSmallestLargestDigit(int n) {
        int max=0,min=9;

        while (n!=0) {
            int div = n%10;
            if (div>max) {
                max = div;
            } else if (div<min) {
                min=div;
            }
            n/=10;
        }

        System.out.println("Smallest = " + min + " and largest = " + max);
    }

    //6. Print all numbers from 1–n whose binary representation has an even number of 1s.
    private static void printWhoseBinContainsEven1(int n) {
        for (int no = 1; no <= n; no++) {
            if (isEven1InBin(no)) {
                System.out.print(no + " ");
            }
        }
    }

    private static boolean isEven1InBin(int n) {
        String sBin = Integer.toBinaryString(n);

        int sum = sBin.chars().filter(e -> ((e-48)&1) == 1).sum();
        return (sum&1) == 0;
    }

    //7. Print a pattern where each row i prints i*i.
    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i*i);
        }
    }

    //8. Print factorial of each number from 1 to n.
    private static void printFactorialFrom1ToN(int n) {
        if (n<1) {
            return;
        }

        int[] factorial = new int[n+1];
        factorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            factorial[i] = i*factorial[i-1];
            System.out.println(factorial[i]);
        }
    }

    //9. Print the sum of all odd digits and even digits separately in a number.
    private static void printSumOfOddAndEvenDigitSeperately(int n) {
        int soOdd=0,soEven=0;

        while (n!=0) {
            int div = n%10;
            if (div%2 == 0) {
                soEven += div;
            }
            else {
                soOdd += div;
            }

            n /= 10;
        }

        System.out.println("Sum of odd number: " + soOdd + " and Sum of even number: " + soEven);
    }

    //10. Take 5 numbers as input. If the user enters 0, skip it using continue. At the end, print the sum of all non-zero numbers entered.
    private static void printSumOfNonZeroNumbers(int[] nums) {
        int sum=0;
        for (int i = 0; i < 5; i++) {
            if (nums[i] == 0) {
                continue;
            }
            sum += nums[i];
        }

        System.out.println("Sum of all non zero numbers is: " + sum);
    }
}
