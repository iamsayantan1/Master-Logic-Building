package com.sayantandas.masterlogicbuildingpdf.p2loopingandpatterns.L4PatternPrinting;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i >= 1; i--) {
            for (int j = i-1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(n-j+1);
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}