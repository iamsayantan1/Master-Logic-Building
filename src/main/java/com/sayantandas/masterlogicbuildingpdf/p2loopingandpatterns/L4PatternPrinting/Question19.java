package com.sayantandas.masterlogicbuildingpdf.p2loopingandpatterns.L4PatternPrinting;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(ch++ + "" + ch++);
                if(ch > 'Z') ch = 'A';
            }
            System.out.println(ch++);
        }
    }
}