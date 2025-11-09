package com.sayantandas.masterlogicbuildingpdf.p3recursion;

public class L1FoundationOfRecursion {
    public static void main(String[] args) {
        printNumFrom1ToN(10);
        System.out.println();
        printNumFromNTo1(10);
        System.out.println();
        printEvenNumFrom1ToN(10);
        System.out.println();
        printOddNumFrom1ToN(10);
        System.out.println();
        printSumOfNNumbers(10);
        printFactorial(5);
        System.out.println("pow(5,3): " + calcPower(5,3));
        System.out.println("pow(5,3): " + calcPower(5,-3));
        System.out.println("10th Fibonacci: " + nThFibonacci(10));
        System.out.print("Print fibonacci upto 10th term: ");
        printFibonacci(10);
        System.out.println();
        System.out.println("Sum of digits of 137: " + sumOfDigits(137));
    }

    //1. Print numbers from 1 to n using recursion.
    private static void printNumFrom1ToN(int n) {
        if (n<=0) {
            return;
        }
        printNumFrom1ToN(n-1);
        System.out.print(n + " ");
    }

    //2. Print numbers from n down to 1 using recursion.
    private static void printNumFromNTo1(int n) {
        if (n<=0) return;
        System.out.print(n + " ");
        printNumFromNTo1(n-1);
    }

    //3. Print only even numbers from 1 to n recursively.
    private static void printEvenNumFrom1ToN(int n) {
        if (n<=0) return;
        printEvenNumFrom1ToN(n-1);
        if (n%2==0) {
            System.out.print(n + " ");
        }
    }

    //4. Print only odd numbers from 1 to n recursively.
    private static void printOddNumFrom1ToN(int n) {
        if (n<=0) return;
        printOddNumFrom1ToN(n-1);
        if (n%2!=0) {
            System.out.print(n + " ");
        }
    }

    //5. Print sum of first n natural numbers recursively.
    private static void printSumOfNNumbers(int n) {
        System.out.println("Sum of " + n + " natural number is: " + sumOfNNumbers(n));
    }

    private static int sumOfNNumbers(int n) {
        if (n<0) return -1;
        else if (n==0) {
            return 0;
        }

        return n + sumOfNNumbers(n-1);
    }

    //6. Print factorial of a number recursively.
    private static void printFactorial(int n) {
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    private static int factorial(int n) {
        if (n<0) return -1;
        else if (n==0) {
            return 1;
        }

        return n*factorial(n-1);
    }

    //7. Calculate power of a number (xⁿ) using recursion.
    private static double calcPower(int x, int n) {
        if (n==0) return 1;
        else if (n<0) {
            return 1.0/(x*calcPower(x,n+1));
        }
        return x*calcPower(x,n-1);
    }

    //8. Find nth Fibonacci number recursively.
    private static int nThFibonacci(int n) {
        if (n<=0) {
            return -1;
        }
        else if (n==1) {
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        return nThFibonacci(n-1) + nThFibonacci(n-2);
    }

    //9. Print Fibonacci series up to n terms recursively.
    private static void printFibonacci(int n) {
        if (n<1) return;
        printFibonacci(n-1);
        System.out.print(nThFibonacci(n) + " ");
    }

    //10. Find sum of digits of a number recursively.
    private static int sumOfDigits(int n) {
        if (n==0) return 0;
        return n%10 + sumOfDigits(n/10);
    }

}
