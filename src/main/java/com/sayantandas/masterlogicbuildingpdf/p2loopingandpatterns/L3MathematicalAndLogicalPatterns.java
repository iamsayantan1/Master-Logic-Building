package com.sayantandas.masterlogicbuildingpdf.p2loopingandpatterns;

import java.util.ArrayList;

public class L3MathematicalAndLogicalPatterns {
    //1. Print the squares of numbers from 1 to n.
    private static void printSquare(int n) {
        for (int no = 1; no <= n; no++) {
            System.out.println("Square of " + no + " is: " + no*no);
        }
    }

    //2. Print cubes of numbers from 1 to n.
    private static void printCube(int n) {
        for (int no = 1; no <= n; no++) {
            System.out.println("Cube of " + no + " is: " + no*no*no);
        }
    }

    //3. Print all numbers between a and b divisible by 7.
    private static void printDivisibilityBy7(int a, int b) {
        System.out.print("Following numbers are divisible by 7 between " + a + " and " + b + ":");
        for (int no = a; no <= b; no++) {
            if(no%7==0) {
                System.out.print(" " + no);
            }
        }
    }

    //4. Find HCF (GCD) of two numbers using loops.
    private static int gcd(int a, int b) {
        int max = -1;
        ArrayList<Integer> divisorsOfA = factors(a);
        ArrayList<Integer> divisorsOfB = factors(b);

        int i=0,j=0,divALen=divisorsOfA.size(),divBLen=divisorsOfB.size();

        while (i!=divALen && j!=divBLen) {
            int divA = divisorsOfA.get(i);
            int divB = divisorsOfB.get(j);

            if(divA==divB) {
                max = divisorsOfA.get(i);
                i++;
                j++;
            }
            else if (divA>divB) {
                j++;
            }
            else {
                i++;
            }
        }

        return max;
    }

    // Helper of 4,7
    private static ArrayList<Integer> factors(int n) {
        ArrayList<Integer> alDivisors = new ArrayList<>();
        if (n>=1) {
            for (int i = 1; i <=n ; i++) {
                if (n%i == 0) {
                    alDivisors.add(i);
                }
            }
        }
        return alDivisors;
    }

    //5. Find LCM of two numbers using loops.
    private static int lcm(int a, int b) {
        if (a<=0 || b<=0) {
            return -1;
        }

        int mulA=a, mulB=b;
        while (mulA != mulB) {
            if (mulA>mulB) {
                mulB += b;
            }
            else {
                mulA += a;
            }
        }

        return mulA;
    }

    //6. Print all factors of a given number.
    private static void printFactors(int n) {
        System.out.println("Factors of n is: " + factors(n));
    }

    //7. Find the sum of all factors of a number.
    private static int sumOfFactors(int n) {
        return factors(n).stream().reduce(Integer::sum).get();
    }

    //8. Check if a number is a strong number (sum of factorials of digits = number).
    private static boolean strongNumber(int n) {
        int num=n, sum=0;

        while (n!=0) {
            sum += factorial(n%10);
            n/=10;
        }

        return num==sum;
    }

    // Helper of 8
    private static int factorial(int n) {
        if(n<0) {
            return -1;
        }
        else if (n==0 || n==1) {
            return 1;
        }

        return n*factorial(n-1);
    }

    //9. Print first n terms of an arithmetic progression (a, d).
    private static void arithmeticProgression(int a, int d, int n) {
        System.out.print("AP: ");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + (a+i*d));
        }
        System.out.println();
    }

    //10. Print first n terms of a geometric progression (a, r).
    private static void geometricProgression(int a, int r, int n) {
        System.out.print("GP: ");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + a*(int)Math.pow(r,i));
        }
        System.out.println();
    }
}
