package com.sayantandas.masterlogicbuildingpdf.p4basicarrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class L5LogicalAndAppliedArrayProblems {
    public static void main(String[] args) {
        int[] arr = {1,9,2,8,7,3,4,6,5,0};
        System.out.println(secondLargest(arr));
        System.out.println(secondSmallest(arr));
    }

    //1. Check if the array is sorted in ascending order.
    private static boolean isSortedAsc(int[] arr) {
        if (arr==null) return true;

        int reference = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (reference <= arr[i]) {
                reference = arr[i];
            }
            else {
                return false;
            }
        }

        return true;
    }

    //2. Check if the array is sorted in descending order.
    private static boolean isSortedDsc(int[] arr) {
        if (arr==null) return true;

        int reference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (reference >= arr[i]) {
                reference = arr[i];
            }
            else {
                return false;
            }
        }

        return true;
    }

    //3. Find the second largest element in an array.
    private static int secondLargest(int[] arr) {
        if (arr==null || arr.length <= 1) return Integer.MIN_VALUE;

        PriorityQueue<Integer> heap = new PriorityQueue<>(2);

        for (int elem : arr) {
            if ((heap.size()==0) || (heap.size()==1 && heap.element() != elem)) {
                heap.add(elem);
            }
            else if (heap.element()<elem) {
                heap.remove();
                heap.add(elem);
            }
        }

        return heap.size() == 2 ? heap.element() : Integer.MIN_VALUE;
    }

    //4. Find the second smallest element in an array.
    private static int secondSmallest(int[] arr) {
        if (arr == null || arr.length <= 1) return Integer.MAX_VALUE;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int e : arr) {
            if ((pq.size()==0) || (pq.size()==1 && pq.element() != e)) {
                pq.add(e);
            }
            else if (pq.element()>e) {
                pq.remove();
                pq.add(e);
            }
        }

        return pq.size() == 2 ? pq.element() : Integer.MAX_VALUE;
    }

    //5. Find the difference between the largest and smallest element.
    private static int differenceBWMaxnMin(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int e : arr) {
            if (e>max) {
                max = e;
            }

            if (e<min) {
                min = e;
            }
        }

        return max-min;
    }

    //6. Find the sum of all elements except the largest and smallest.
    private static int sumOfElements(int[] arr) {
        if (arr == null || arr.length <= 1) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum=0;

        for (int e : arr) {
            sum += e;
            if (e>max) {
                max = e;
            }
            if (e<min) {
                min = e;
            }
        }

        return sum-max-min;
    }

    //7. Count how many pairs of elements have a sum equal to a given number k.
    private static int countNoOfPairs(int[] arr, int k) {
        if (arr == null || arr.length <= 1) return 0;
        int count=0;

        Map<Integer,Integer> freqmap = new HashMap<>();
        for (int elem : arr) {
            int complement = k-elem;
            if (freqmap.containsKey(complement)) {
                count += freqmap.get(complement);
            }
            freqmap.put(elem,freqmap.getOrDefault(elem,0)+1);
        }

        return count;
    }

    //8. Count how many elements are greater than the average of the array.
    private static int countGreaterThanAverage(int[] arr) {
        if (arr == null || arr.length <= 1) return 0;
        int sum = 0, moreThanAvg=0;

        for (int e : arr) {
            sum += e;
        }

        double average = (1.0*sum)/arr.length;

        for (int e : arr) {
            if (average<e) {
                moreThanAvg++;
            }
        }

        return moreThanAvg;
    }



    //9. Print the frequency of each distinct element.
    private static void printFrequency(int[] arr) {
        if (arr == null || arr.length == 0) return;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int e : arr) {
            hm.put(e,hm.getOrDefault(e,0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    //10. Print all unique elements (those that occur exactly once).
    private static void printUniqueElements(int[] arr) {
        if (arr == null || arr.length == 0) return;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int e : arr) {
            hm.put(e,hm.getOrDefault(e,0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
}
