package com.sayantandas.masterlogicbuildingpdf.p6mixedlogicalchallenges;

import java.util.HashSet;
import java.util.Set;

public class C1NumberBasedLogicalCombinations {
    //1. Print all numbers between 1 and N that are divisible by both 3 and 5.
    private static void print1ToN(int n) {
        System.out.print("No: ");
        for (int i = 1; i <= n; i++) {
            if (i%3==0 && i%5==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //2. Find the sum of digits of a number (use loop).
    private static int sumOfDigit(int n) {
        int sum = 0;

        while (n!=0) {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }

    //3. Check if a number is an Armstrong number.
    private static boolean isArmstrong(int n) {
        int num = n, sum = 0;
        int noOfDigit = noOfDigit(n);

        while (num!=0) {
            sum += Math.pow(num%10,noOfDigit);
            num /= 10;
        }

        return sum == n;
    }

    private static int noOfDigit(int n) {
        int noOfDigit = 0;
        while (n!=0) {
            noOfDigit++;
            n /= 10;
        }
        return noOfDigit;
    }

    //4. Print all Armstrong numbers between 1 and 1000.
    private static void printArmstrong() {
        System.out.print("Armstrong:");
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }

    //5. Find the factorial of a number using recursion.
    private static int factorial(int n) {
        if (n<=0) return -1;
        if (n==0 || n==1) return 1;
        return n*factorial(n-1);
    }

    //6. Count how many even digits a number contains.
    private static int numberOfEvenDigits(int n) {
        int count = 0;
        while (n!=0) {
            if ((n%10)%2 == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    //7. Print all prime numbers between 1 and N.
    private static void printPrimeNumbersBW1ToN(int n) {
        if (n<0) {
            System.out.println("Invalid input.");
            return;
        }
        else if (n<2) {
            System.out.println("There are no prime no in this range.");
            return;
        }

        boolean[] prime = new boolean[n+1];
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i <=n ; i++) {
            prime[i] = true;
        }

        for (int i = 2; i*i <=n; i++) {
            if (prime[i]) {
                for (int j = i*i; j <= n; j = j+i) {
                    prime[j] = false;
                }
            }
        }

        System.out.print("Prime No:");
        for (int i=1; i<=n; i++) {
            if (prime[i]) {
                System.out.print(" " + i);
            }
        }

        System.out.println();
    }

    //8. Print the reverse of a number (123 → 321).
    private static void printReverse(int n) {
        System.out.println("Reverse of " + n + " is: " + reverse(String.valueOf(n)));
        System.out.println("Reverse of " + n + " is: " + new StringBuilder(String.valueOf(n)).reverse());
    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    //9. Check if a number is palindrome (121 → true).
    private static boolean isPalindrome(int n) {
        int rev = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());

        return n == rev;
    }

    //10. Check if a number is perfect (sum of factors equals number).
    private static boolean isPerfectNumber(int n) {
        Set<Integer> factors = getFactors(n);

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum == n;
    }

    private static Set<Integer> getFactors(int n) {
        Set<Integer> factors = new HashSet<>();

        factors.add(1);
        for (int i = 2; i*i <=n ; i++) {
            if (n%i == 0) {
                factors.add(i);
                factors.add(n/i);
            }
        }

        return factors;
    }
}
