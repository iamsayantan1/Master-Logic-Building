package com.sayantandas.masterlogicbuildingpdf.p3recursion;

public class L2NumberBasedRecursiveThinking {
    public static void main(String[] args) {
        System.out.println(countNumOfDigits(12300));
        System.out.println(reverseNum(12300));
        System.out.println(numToBin(12));
        printDigitOfNum(154);
        System.out.println();
        System.out.println("Sum of 1st 5 even numbers is: " + sumOfFirstNEvenNums(5));
        System.out.println("Sum of 1st 5 odd numbers is: " + sumOfFirstOddNums(5));
        System.out.println("10C3: " + numberOfCombination(10,3));
    }

    //1. Count the number of digits in a number recursively.
    private static int countNumOfDigits(int n) {
        if (n/10==0) {
            return 1;
        }
        return 1+countNumOfDigits(n/10);
    }

    //2. Reverse a number recursively.
    private static int reverseNum(int n) {
        if (n==0) {
            return 0;
        }
        else if (n/10==0) {
            return n;
        }

        return reverseNum(n/10) + (int)Math.pow(10,countNumOfDigits(n/10))*(n%10);
    }

    //3. Check if a number is a palindrome using recursion.
    private static boolean checkPalindrome(int n) {
        return reverseNum(n) == n;
    }

    //4. Find product of digits of a number recursively.
    private static int productOfDigits(int n) {
        if (n/10==0) {
            return n;
        }
        return productOfDigits(n/10)*(n%10);
    }

    //5. Find GCD (HCF) of two numbers using Euclid’s algorithm recursively.
    private static int gcd(int a, int b) {
        if (b==0) return a;
        if (a%b==0) return b;
        return gcd(b,a%b);
    }

    //6. Convert a number to binary recursively.
    private static long numToBin(int n) {
        if (n==0) return 0;
        else if (n == 1) return 1;
        return numToBin(n/2)*10 + n%2;
    }

    //7. Print digits of a number in words recursively (e.g., 123 → “one two three”).
    private static void printDigitOfNum(int n) {
        if (n==0) {
            System.out.println("zero");
        }
        else if (n/10 == 0) {
            return;
        }
        printDigitOfNum(n/10);
        String word = switch (n%10) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "zero";
        };

        System.out.print(word+" ");
    }

    //8. Calculate the sum of first n even numbers recursively.
    private static int sumOfFirstNEvenNums(int n) {
        if (n<0) return -1;
        else if (n==0) return 0;
        return sumOfFirstNEvenNums(n-1)+2*n;
    }

    //9. Calculate the sum of first n odd numbers recursively.
    private static int sumOfFirstOddNums(int n) {
        if (n<0) return -1;
        else if (n==0) return 0;
        return sumOfFirstOddNums(n-1)+(2*n-1);
    }

    //10. Find nCr (Combination formula) recursively using Pascal’s relation.
    private static int numberOfCombination(int n, int r) {
        if (n<=0) return -1;
        else if (n==1 && r==n) return 1;
        else if (r>n) return 0;
        return numberOfCombination(n-1,r) + numberOfCombination(n-1,r-1);
    }

}
