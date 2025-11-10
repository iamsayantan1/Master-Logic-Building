package com.sayantandas.masterlogicbuildingpdf.p4basicarrays;

public class L1FundamentalsOfArrays {
    //1. Input n and take n integers into an array; print them.
    private static void printArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    //2. Find the sum of all elements in an array.
    private static int sumOfElementInArray(int[] arr) {
        int sum=0;
        for (int e : arr) {
            sum += e;
        }
        return sum;
    }

    //3. Find the average of array elements.
    private static double average(int[] arr) {
        int sum=0;
        for (int e : arr) {
            sum += e;
        }
        return (double)sum/arr.length;
    }

    //4. Find the maximum element in an array.
    private static int max(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int e : arr) {
            if (max<e) {
                max = e;
            }
        }

        return max;
    }

    //5. Find the minimum element in an array.
    private static int min(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int e : arr) {
            if (min>e) {
                min = e;
            }
        }

        return min;
    }

    //6. Count how many elements are positive, negative, or zero.
    private static void countElements(int[] arr) {
        int pos=0, neg=0, zero=0;

        for (int e : arr) {
            if (e==0) zero++;
            else if (e>0) pos++;
            else neg++;
        }

        System.out.println("No of positive: " + pos + ", negative: " + neg + ", zero: " + zero);
    }

    //7. Count how many elements are even and odd.
    private static void noOfEvenOdd(int[] arr) {
        int even=0, odd=0;

        for (int e : arr) {
            if (e%2==0) even++;
            else odd++;
        }

        System.out.println("No of even: " + even + " and odd: " + odd);
    }

    //8. Find the index of the maximum element.
    private static int indexOfMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i=0; i<arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }

    //9. Find the index of the minimum element.
    private static int indexOfMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i=0; i<arr.length; i++) {
            if (min>arr[i]) {
                min = arr[i];
                index = i;
            }
        }

        return index;
    }

    //10. Take n elements and print only those greater than a given value k.
    private static void printGreaterThanK(int[] arr, int k) {
        for (int e:arr) {
            if (e>k) {
                System.out.println(e);
            }
        }
    }
}
