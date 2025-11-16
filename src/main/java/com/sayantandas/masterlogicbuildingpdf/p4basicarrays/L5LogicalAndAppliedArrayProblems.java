package com.sayantandas.masterlogicbuildingpdf.p4basicarrays;

import java.util.PriorityQueue;

public class L5LogicalAndAppliedArrayProblems {
    public static void main(String[] args) {
        int[] arr = {1,9,2,8,7,3,4,6,5,0};
        System.out.println(secondLargest(arr));
    }

    //1. Check if the array is sorted in ascending order.
    private static boolean isSortedAsc(int[] arr) {
        if (arr==null) return true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i+1]<arr[i]) {
                return false;
            }
        }

        return true;
    }

    //2. Check if the array is sorted in descending order.
    private static boolean isSortedDsc(int[] arr) {
        if (arr==null) return true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i+1]>arr[i]) {
                return false;
            }
        }

        return true;
    }

    //3. Find the second largest element in an array.
    private static int secondLargest(int[] arr) {
        if (arr==null) return Integer.MIN_VALUE;

        PriorityQueue<Integer> heap = new PriorityQueue<>(2);

        for (int elem : arr) {
            if (heap.size()<2) {
                heap.add(elem);
            }
            else if (heap.element()<elem) {
                heap.remove();
                heap.add(elem);
            }
        }

        return heap.element();
    }

    //4. Find the second smallest element in an array.
    //5. Find the difference between the largest and smallest element.
    //6. Find the sum of all elements except the largest and smallest.
    //7. Count how many pairs of elements have a sum equal to a given number k.
    //8. Count how many elements are greater than the average of the array.
    //9. Print the frequency of each distinct element.
    //10. Print all unique elements (those that occur exactly once).
}
