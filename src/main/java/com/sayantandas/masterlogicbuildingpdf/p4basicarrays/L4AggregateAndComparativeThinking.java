package com.sayantandas.masterlogicbuildingpdf.p4basicarrays;

import java.util.*;

public class L4AggregateAndComparativeThinking {
    //1. Compare two arrays — check if they are equal (same elements & order).
    private static boolean sameElemAndOrderArr(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) return true;
        else if (arr1 == null || arr2 == null) {
            return false;
        } else if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    //2. Compare two arrays — check if they contain the same elements (ignore order).
    private static boolean sameElemArr(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) return true;
        else if (arr1 == null || arr2 == null) {
            return false;
        } else if (arr1.length != arr2.length) {
            return false;
        }

        Map<Integer,Integer> hashMap1 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            hashMap1.put(arr1[i], hashMap1.getOrDefault(arr1[i],0)+1);
        }

        Map<Integer,Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            hashMap2.put(arr2[i], hashMap2.getOrDefault(arr2[i],0)+1);
        }

        if (hashMap1.size() != hashMap2.size()) {
            return false;
        }

        for (Map.Entry<Integer,Integer> elem : hashMap1.entrySet()) {
            if (!elem.getValue().equals(hashMap2.getOrDefault(elem.getKey(), 0))) {
                return false;
            }
        }

        return true;
    }

    //3. Merge two arrays into a third array.
    private static int[] mergeArr(int[] arr1, int[] arr2) {
        if (arr1 == null) {
            return arr2;
        }
        else if (arr2 == null) {
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

    //4. Find the common elements between two arrays.
    private static int[] commonsInArr(int[] arr1, int[] arr2) {
        if (arr1 == null) {
            return arr2;
        }
        else if (arr2 == null) {
            return arr1;
        }

        Set<Integer> set1 = new HashSet<>();
        for (int e : arr1) {
            set1.add(e);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int e : arr2) {
            set2.add(e);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int e : set1) {
            if (set2.contains(e)) {
                list.add(e);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    //5. Find elements that are in one array but not in the other.
    private static int[] differenceInArr(int[] arr1, int[] arr2) {
        if (arr1 == null) {
            return arr2;
        }
        else if (arr2 == null) {
            return arr1;
        }

        Set<Integer> set1 = new HashSet<>();
        for (int e : arr1) {
            set1.add(e);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int e : arr2) {
            set2.add(e);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int e : set1) {
            if (!set2.contains(e)) {
                list.add(e);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    //6. Count how many elements are common between two arrays.
    private static int commonCountInArr(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return 0;
        }

        Set<Integer> set1 = new HashSet<>();
        for (int e : arr1) {
            set1.add(e);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int e : arr2) {
            set2.add(e);
        }

        int count=0;
        for (int e : set1) {
            if (set2.contains(e)) {
                count++;
            }
        }

        return count;
    }

    //7. Find element-wise sum of two arrays (A[i] + B[i]).
    private static int[] sumArr(int[] arr1, int[] arr2) {
        if (arr1 == null) {
            return arr2;
        }
        else if (arr2 == null) {
            return arr1;
        }

        int minLen = Math.min(arr1.length, arr2.length);

        int[] newArr = new int[minLen];
        for (int i = 0; i < minLen; i++) {
            newArr[i] = arr1[i] + arr2[i];
        }

        return newArr;
    }

    //8. Find element-wise product of two arrays.
    private static int[] prodArr(int[] arr1, int[] arr2) {
        if (arr1 == null) {
            return arr2;
        }
        else if (arr2 == null) {
            return arr1;
        }

        int minLen = Math.min(arr1.length, arr2.length);

        int[] newArr = new int[minLen];
        for (int i = 0; i < minLen; i++) {
            newArr[i] = arr1[i]*arr2[i];
        }

        return newArr;
    }

    //9. Create a frequency array of numbers (count occurrence of each number).
    private static Map<Integer,Integer> frequencyArr(int[] arr) {
        if (arr == null) {
            return null;
        }

        Map<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }

        return hm;
    }

    //10. Print all elements that appear more than once.
    private static void printIfMoreThan1(int[] arr) {
        Map<Integer,Integer> hm = frequencyArr(arr);

        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            if (entry.getValue()>1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
