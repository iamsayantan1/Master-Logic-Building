package com.sayantandas.masterlogicbuildingpdf.p2loopingandpatterns.L4PatternPrinting;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        boolean zrOn = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(zrOn ? "1 " : "0 ");
                zrOn = !zrOn;
            }
            System.out.println();
        }
    }
}