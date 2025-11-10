package com.sayantandas.masterlogicbuildingpdf.p3recursion;

public class L3PatternAndPrintingProblems {
    public static void main(String[] args) {
        printLineOfStars(4);
        System.out.println("\n");
        printSquareOfStars(4);
        System.out.println();
        printTriangleOfStarsTD(5);
        System.out.println();
        printTriangleOfStarsBU(5);
        System.out.println();
        printPatternOfNums(5);
        System.out.println();
        printReverseTriangle(5);
        System.out.println();
        printMulTableOfN(5);
        System.out.println();
        printNumInOrders(5);
        System.out.println("\n");
        printSumOfSeries(5);
        System.out.println();
        printPatternOfChars(5);
    }

    //1. Print a line of n stars recursively.
    private static void printLineOfStars(int n) {
        if (n<1) return;
        System.out.print("* ");
        printLineOfStars(n-1);
    }

    //2. Print a square of stars recursively (n×n).
    private static void printSquareOfStars(int n) {
        helperSquareOfStars(n,n);
    }

    private static void helperSquareOfStars(int m, int n) {
        if (m<1) return;
        printLineOfStars(n);
        System.out.println();
        helperSquareOfStars(m-1,n);
    }

    //3. Print a triangle of stars recursively (top-down).
    private static void printTriangleOfStarsTD(int n) {
        if (n<1) return;
        printTriangleOfStarsTD(n-1);
        printLineOfStars(n);
        System.out.println();
    }

    //4. Print a triangle of stars recursively (bottom-up).
    private static void printTriangleOfStarsBU(int n) {
        if (n<1) return;
        printLineOfStars(n);
        System.out.println();
        printTriangleOfStarsBU(n-1);
    }

    private static void printNums(int n) {
        if (n<1) return;
        printNums(n-1);
        System.out.print(n + " ");
    }

    //5. Print pattern of numbers recursively (1 to n each row).
    private static void printPatternOfNums(int n) {
        if (n<1) return;
        printPatternOfNums(n-1);
        printNums(n);
        System.out.println();
    }

    //6. Print reverse triangle pattern recursively.
    private static void printReverseTriangle(int n) {
        if (n<1) return;
        printNums(n);
        System.out.println();
        printReverseTriangle(n-1);
    }

    //7. Print multiplication table of n recursively.
    private static void printMulTableOfN(int n) {
        helperMulTableOfN(n,n);
    }

    private static void helperMulTableOfN(int m, int n) {
        if (m<1 || n<1) return;
        helperMulTableOfN(m,n-1);
        System.out.println(m + " x " + n + " = " + m*n);
    }

    //8. Print numbers in increasing and decreasing order in same function.
    private static void printNumInOrders(int n) {
        oneToN(n);
        nToOne(n-1);
    }

    private static void oneToN(int n) {
        if (n<1) return;
        oneToN(n-1);
        System.out.print(n + " ");
    }

    private static void nToOne(int n) {
        if (n<1) return;
        System.out.print(n + " ");
        nToOne(n-1);
    }

    //9. Print sum of series 1 + 2 + 3 + ... + n recursively and display each step.
    private static void printSumOfSeries(int n) {
        helperSumOfSeries(n);
    }

    private static void helperSumOfSeries(int n) {
        if (n<1) return;
        helperSumOfSeries(n-1);
        System.out.print(1);
        for (int no = 2; no <= n; no++) {
            System.out.print(" + " + no);
        }
        System.out.println(" = " + n*(n+1)/2);
    }

    //10. Print pattern of characters (A, AB, ABC, ...) recursively.
    private static void printPatternOfChars(int n) {
        if (n<1) return;
        printPatternOfChars(n-1);
        helperPatternOfChars((char)('A' + n -1));
        System.out.print(", ");
    }

    private static void helperPatternOfChars(char ch) {
        if (ch<'A' || ch>'Z') return;
        helperPatternOfChars((char)(ch-1));
        System.out.print(ch);
    }
}
