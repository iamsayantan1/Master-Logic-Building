package com.sayantandas.masterlogicbuildingpdf.p6mixedlogicalchallenges;

import java.util.*;

public class C3ArrayAndLoopingLogic {
    public static void main(String[] args) {
//        shiftAllZeros(new int[]{1,2,0,3,4,0,5,0,6,7,8,0,9});
        rotateRightBy1Pos(new int[]{1,2,0,3,4,0,5,0,6,7,8,0,9});
    }

    //1. Find the maximum and minimum element in an array.
    private static void maxMinElements(int[] elements) {
        if (elements == null || elements.length == 0) return;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int elem : elements) {
            if (max < elem) {
                max = elem;
            }

            if (min > elem) {
                min = elem;
            }
        }

        System.out.println("Max: " + max + ", Min: " + min);
    }

    //2. Count how many positive, negative, and zero elements are in an array.
    private static void countPosNegZero(int[] elements) {
        if (elements == null || elements.length == 0) return;
        int pos,neg,zero;
        pos=neg=zero=0;

        for (int elem : elements) {
            if (elem==0) {
                zero++;
            }
            else if (elem > 0) {
                pos++;
            }
            else {
                neg++;
            }
        }

        System.out.println("No of Positive element: " + pos + ", Negative element: " + neg + ", Zero: " + zero);
    }

    //3. Print all unique elements from an array.
    private static void printUniqueElements(int[] elements) {
        if (elements == null || elements.length == 0) return;

        Set<Integer> set = new HashSet<>();
        for (int elem : elements) {
            set.add(elem);
        }

        System.out.println("Unique elements: " + Arrays.toString(set.toArray()));
    }

    //4. Reverse an array in-place.
    private static void reverseArray(int[] elements) {
        if (elements == null || elements.length == 0) return;
        System.out.println("Initially -> " + Arrays.toString(elements));

        int start=0, end=elements.length-1;

        while (end>start) {
            int temp = elements[start];
            elements[start] = elements[end];
            elements[end] = temp;
            start++;
            end--;
        }

        System.out.println("After reversing array -> " + Arrays.toString(elements));
    }

    //5. Shift all zeros to the end of the array.
    private static void shiftAllZeros(int[] elements) {
        if (elements == null || elements.length == 0) return;
        int noOfZero=0;

        System.out.println("Initially -> " + Arrays.toString(elements));

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0) {
                noOfZero++;
            }
            else {
                elements[i-noOfZero] = elements[i];

                if (noOfZero>0) {
                    elements[i] = 0;
                }
            }
        }

        System.out.println("After shifting all zero to end -> " + Arrays.toString(elements));
    }

    //6. Count how many elements are even at an even index.
    private static int countEvenElementAtEvenIndex(int[] elements) {
        if (elements == null || elements.length == 0) return 0;

        int noOfEvenAtEvenIdx=0;
        for (int i = 0; i < elements.length; i++) {
            if (i%2==0 && elements[i]%2==0) {
                noOfEvenAtEvenIdx++;
            }
        }

        return noOfEvenAtEvenIdx;
    }

    //7. Merge two arrays into one.
    private static int[] merge2Arrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0) {
            return arr2;
        }
        else if (arr2 == null || arr2.length == 0){
            return arr1;
        }

        int[] newArr = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length+i] = arr2[i];
        }

        return newArr;
    }

    //8. Find the second largest element in an array.
    private static int findSecondLargest(int[] elements) {
        if (elements == null || elements.length < 2) return Integer.MIN_VALUE;

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int element : elements) {
            if (largest<element) {
                secondLargest = largest;
                largest = element;
            }
            else if (secondLargest<element && element!=largest) {
                secondLargest = element;
            }
        }

        return secondLargest;
    }

    //9. Rotate an array by one position to the right.
    private static void rotateRightBy1Pos(int[] elements) {
        if (elements == null || elements.length <= 1) return;

        System.out.println("Initially -> " + Arrays.toString(elements));

        int lastElem = elements[elements.length-1];
        for (int i = elements.length-1; i > 0; i--) {
            elements[i] = elements[i-1];
        }
        elements[0] = lastElem;

        System.out.println("After shifting array by one position to the right -> " + Arrays.toString(elements));
    }

    //10. Find the sum of all elements at odd indices.
    private static void sumOfElemsAtOddIndices(int[] elements) {
        if (elements == null) return;

        int sum=0;
        for (int i = 0; i < elements.length; i++) {
            if (i%2==1) {
                sum += elements[i];
            }
        }

        System.out.println("Sum of elements at odd indices = " + sum);
    }
}
