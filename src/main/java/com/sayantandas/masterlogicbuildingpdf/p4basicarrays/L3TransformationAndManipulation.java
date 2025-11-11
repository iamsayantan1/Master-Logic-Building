package com.sayantandas.masterlogicbuildingpdf.p4basicarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class L3TransformationAndManipulation {
    public static void main(String[] args) {
        // 1. sqrArray tests
        System.out.println("sqrArray Tests:");
        System.out.println(Arrays.toString(sqrArray(new int[]{1, 2, 3, 4})));        // [1,4,9,16]
        System.out.println(Arrays.toString(sqrArray(new int[]{-2, 0, 5})));          // [4,0,25]
        System.out.println(Arrays.toString(sqrArray(new int[]{})));                  // []
        System.out.println(sqrArray(null));                                         // null

        // 2. evenArray tests
        System.out.println("\nevenArray Tests:");
        System.out.println(Arrays.toString(evenArray(new int[]{1, 2, 3, 4, 5, 6}))); // [2,4,6]
        System.out.println(Arrays.toString(evenArray(new int[]{1, 3, 5})));          // []
        System.out.println(Arrays.toString(evenArray(null)));                       // null

        // 3. nonNegArray tests
        System.out.println("\nnonNegArray Tests:");
        int[] arr3 = {1, -4, 2, -8};
        nonNegArray(arr3);
        System.out.println(Arrays.toString(arr3));                                  // [1,0,2,0]

        // 4. binArray tests
        System.out.println("\nbinArray Tests:");
        int[] arr4 = {2, 3, 4, 5};
        binArray(arr4);
        System.out.println(Arrays.toString(arr4));                                  // [1,0,1,0]

        // 5. swapFirstLastInArray tests
        System.out.println("\nswapFirstLastInArray Tests:");
        int[] arr5 = {1, 2, 3, 4};
        swapFirstLastInArray(arr5);
        System.out.println(Arrays.toString(arr5));                                  // [4,2,3,1]

        // 6. reverseArray tests
        System.out.println("\nreverseArray Tests:");
        int[] arr6 = {1, 2, 3, 4};
        reverseArray(arr6);
        System.out.println(Arrays.toString(arr6));                                  // [4,3,2,1]

        // 7. rotateArrayByToLeftBy1 tests
        System.out.println("\nrotateArrayByToLeftBy1 Tests:");
        int[] arr7 = {1, 2, 3, 4};
        rotateArrayByToLeftBy1(arr7);
        System.out.println(Arrays.toString(arr7));                                  // [2,3,4,1]

        // 8. rotateArrayByToRightBy1 tests
        System.out.println("\nrotateArrayByToRightBy1 Tests:");
        int[] arr8 = {1, 2, 3, 4};
        rotateArrayByToRightBy1(arr8);
        System.out.println(Arrays.toString(arr8));                                  // [4,1,2,3]

        // 9. swapAlternativeElem tests
        System.out.println("\nswapAlternativeElem Tests:");
        int[] arr9 = {1, 2, 3, 4};
        swapAlternativeElem(arr9);
        System.out.println(Arrays.toString(arr9));                                  // [2,1,4,3]

        // 10. copyArr tests
        System.out.println("\ncopyArr Tests:");
        int[] arr10 = {1, 2, 3};
        int[] arr10Copy = copyArr(arr10);
        System.out.println(Arrays.toString(arr10Copy));                             // [1, 2, 3]
    }
    
    //1. Create a new array containing squares of all numbers.
    private static int[] sqrArray(int[] arr) {
        if (arr == null) return null;

        int[] sqrArr = new int[arr.length];
        int it=0;
        for (int e : arr) {
            sqrArr[it++] = e*e;
        }

        return sqrArr;
    }

    //2. Create a new array containing only even elements.
    private static int[] evenArray(int[] arr) {
        if (arr == null) return null;

        ArrayList<Integer> evenAL = new ArrayList<>();
        for (int e : arr) {
            if (e%2==0) evenAL.add(e);
        }

        return evenAL.stream().mapToInt(Integer::intValue).toArray();
    }

    //3. Replace every negative number with 0.
    private static void nonNegArray(int[] arr) {
        if (arr == null) return;

        int it=0;
        for (int e : arr) {
            if (e<0) {
                arr[it] = 0;
            }
            it++;
        }
    }

    //4. Replace all even numbers with 1 and all odd with 0.
    private static void binArray(int[] arr) {
        if (arr == null) return;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2 == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }
    }

    //5. Swap the first and last elements of the array.
    private static void swapFirstLastInArray(int[] arr) {
        if (arr == null || arr.length<2) return;

        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }

    //6. Reverse an array (without using built-in reverse).
    private static void reverseArray(int[] arr) {
        if (arr == null || arr.length<2) return;
        int fPtr = 0;
        int lPtr = arr.length-1;

        while (lPtr>fPtr) {
            // swap
            int temp = arr[fPtr];
            arr[fPtr] = arr[lPtr];
            arr[lPtr] = temp;

            fPtr++;
            lPtr--;
        }
    }

    //7. Rotate an array by one position to the left.
    private static void rotateArrayByToLeftBy1(int[] arr) {
        if (arr == null || arr.length<2) return;

        int firstElem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = firstElem;
    }

    //8. Rotate an array by one position to the right.
    private static void rotateArrayByToRightBy1(int[] arr) {
        if (arr == null || arr.length<2) return;

        int lastElem = arr[arr.length-1];

        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = lastElem;
    }

    //9. Swap alternate elements (1st ↔ 2nd, 3rd ↔ 4th, etc.).
    private static void swapAlternativeElem(int[] arr) {
        if (arr == null || arr.length<2) return;

        for (int i = 0; i < arr.length; i=i+2) {
            if (i == arr.length-1) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    //10. Copy one array to another manually.
    private static int[] copyArr(int[] arr) {
        if (arr == null) return null;

        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }
}
