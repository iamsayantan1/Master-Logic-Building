package com.sayantandas.masterlogicbuildingpdf.p2loopingandpatterns.L4PatternPrinting;

import java.util.Scanner;

// 3. Print n Stars on Same Line
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
