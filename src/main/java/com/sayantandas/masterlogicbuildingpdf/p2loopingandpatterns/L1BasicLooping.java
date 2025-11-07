package com.sayantandas.masterlogicbuildingpdf.p2loopingandpatterns;

public class L1BasicLooping {
    public static void main(String[] args) {
        printSumOfEven(10);
        printSumOfOdd(10);
    }

    //1. Print numbers from 1 to 10.
    private static void printNumbers() {
        for (int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }
    }

    //2. Print all even numbers between 1 and 100.
    private static void printEvenNumbers() {
        for (int i=1; i<=100; i++) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //3. Print all odd numbers between 1 and 100.
    private static void printOddNumbers() {
        for (int i=1; i<=100; i++) {
            if (i%2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    //4. Print numbers from 10 down to 1.
    private static void printReverseNumbers() {
        for (int i=10; i>=1; i--) {
            System.out.print(i + " ");
        }
    }

    //5. Print the table of a given number (n × 1 to n × 10).
    private static void printTable(int n) {
        for (int i=1; i<=10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    //6. Print the sum of first n natural numbers.
    private static void printSumOfNNumbers(int n) {
        if (n<0) {
            return;
        }
        System.out.println("Sum of first " + n + " numbers is: " + n*(n+1)/2);
    }

    //7. Print the sum of all even numbers up to n.
    private static void printSumOfEven(int n) {
        if (n<1) {
            return;
        }
        System.out.println("Sum of even numbers up to " + n + " is: " + (n*(n+1)/2 - ((n+1)/2)*((n+1)/2)));
    }

    //8. Print the sum of all odd numbers up to n.
    private static void printSumOfOdd(int n) {
        if (n<1) {
            return;
        }
        System.out.println("Sum of odd numbers up to " + n + " is: " + ((n+1)/2)*((n+1)/2));
    }

    //9. Print the factorial of a given number.
    private static void printFactorial(int n) {
        if (n<0) {
            return;
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }

    //10. Print the product of digits of a given number.
    private static void printProductOfDigits(int n) {
        int num=n, product=1;

        while (num != 0) {
            product *= num%10;
            num /= 10;
        }

        System.out.println("Product of the digit of the number " + n + " is " + product);
    }

}
