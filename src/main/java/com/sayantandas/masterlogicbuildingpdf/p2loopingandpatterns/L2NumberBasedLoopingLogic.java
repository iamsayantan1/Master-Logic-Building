package com.sayantandas.masterlogicbuildingpdf.p2loopingandpatterns;

public class L2NumberBasedLoopingLogic {
    //1. Count the number of digits in a given number.
    private static int countDigit(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    //2. Print the reverse of a given number.
    private static void reverse(int n) {
        int num=n, reverse=0;

        while (n!=0) {
            reverse = reverse*10 + n%10;
            n /= 10;
        }

        System.out.println("Reverse of " + num + " is: " + reverse);
    }

    //3. Check if a number is a palindrome.
    private static boolean isPalindrome(int n) {
        int num=n, reverse=0;

        while (n!=0) {
            reverse = reverse*10 + n%10;
            n /= 10;
        }

        return num == reverse;
    }

    //4. Find the sum of digits of a number.
    private static int sumOfDigits(int n) {
        int sod=0;

        while (n!=0) {
            sod += n%10;
            n /= 10;
        }

        return sod;
    }

    //5. Check if a number is an Armstrong number.
    private static boolean isArmstrong(int n) {
        int num = n, armstrong=0;
        int noOfDigits = countDigit(n);

        while (n!=0) {
            armstrong += Math.pow(n%10,noOfDigits);
            n /= 10;
        }

        return num == armstrong;
    }

    //6. Check if a number is a perfect number.
    private static boolean isPerfect(int n) {
        int num=n, perfect=0;

        for (int no = 1; no < n; no++) {
            if (n%no == 0) {
                perfect += no;
            }
        }

        return num == perfect;
    }

    //7. Print all prime numbers between 1 and 100.
    private static void printPrime() {
        boolean[] prime = new boolean[101];
        for (int no = 2; no*no <= 100; no++) {
            int count = 2;
            if (!prime[no]) {
                while (no * count <= 100) {
                    prime[no * count] = true;
                    count++;
                }
            }
        }

        System.out.print("Prime no between 1-100 are: ");
        for (int no = 2; no <= 100; no++) {
            if (!prime[no]) {
                System.out.print(no + " ");
            }
        }
    }

    //8. Check if a number is prime or not.
    private static boolean isPrime(int n) {
        if (n<2) {
            return false;
        }

        for (int no = 2; no*no <= n; no++) {
            if (n%no == 0) {
                return false;
            }
        }

        return true;
    }

    //9. Print Fibonacci series up to n terms.
    private static void printFibonacci(int n) {
        int a=0, b=1;

        if (n<=0) {
            return;
        }
        if (n==1) {
            System.out.print(a);
        }
        else if (n>=2) {
            System.out.print(a + " " + b);
        }

        for (int no = 3; no <= n; no++) {
            System.out.print(" " + (a + b));
            int temp = a;
            a = b;
            b += temp;
        }
    }

    //10. Print sum of first n terms of Fibonacci series.
    private static void sumOfFibonnaci(int n) {
        int sum=0, a=0, b=1;

        if (n > 1) {
            sum = 1;
        }

        for (int no = 3; no <= n; no++) {
            int temp = a;
            a = b;
            b += temp;

            sum += b;
        }

        System.out.println("Sum of fibonnaci number upto n = " + sum);
    }
}
