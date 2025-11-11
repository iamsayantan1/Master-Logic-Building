package com.sayantandas.masterlogicbuildingpdf.p4basicarrays;

import java.util.HashSet;

public class L2SearchingAndCountingLogic {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 10, 11, 25, 16, 9};

        // Test 1: searchArray
        System.out.println("searchArray (3): " + searchArray(arr, 3)); // true
        System.out.println("searchArray (7): " + searchArray(arr, 7)); // false

        // Test 2: countElemInArray
        System.out.println("countElemInArray (3): " + countElemInArray(arr, 3)); // 2
        System.out.println("countElemInArray (7): " + countElemInArray(arr, 7)); // 0

        // Test 3: firstOccurenceInArray
        System.out.println("firstOccurenceInArray (3): " + firstOccurenceInArray(arr, 3)); // 1
        System.out.println("firstOccurenceInArray (7): " + firstOccurenceInArray(arr, 7)); // -1

        // Test 4: lastOccurenceInArray
        System.out.println("lastOccurenceInArray (3): " + lastOccurenceInArray(arr, 3)); // 3
        System.out.println("lastOccurenceInArray (7): " + lastOccurenceInArray(arr, 7)); // -1

        // Test 5: uniqueArray
        System.out.println("uniqueArray: " + uniqueArray(arr)); // false
        System.out.println("uniqueArray empty: " + uniqueArray(new int[] {})); // true
        System.out.println("uniqueArray all unique: " + uniqueArray(new int[] {1,2,3})); // true

        // Test 6: sumOfEven
        System.out.println("sumOfEven: " + sumOfEven(arr)); // 2 + 10 + 16 = 28

        // Test 7: sumOfOdd
        System.out.println("sumOfOdd: " + sumOfOdd(arr)); // 3 + 5 + 3 + 11 + 25 + 9 = 56

        // Test 8: countPrime
        System.out.println("countPrime: " + countPrime(arr)); // primes: 2,3,3,5,11 => 5

        // Test 9: countDivisibleNum
        System.out.println("countDivisibleNum (divisible by 3 and 5): " + countDivisibleNum(arr)); // 25 only? No, 15 not present, so 0

        // Test 10: countSquares
        System.out.println("countSquares: " + countSquares(arr)); // 16 and 9 are perfect squares => 2

        // Null array tests
        System.out.println("searchArray null: " + searchArray(null, 3)); // false
        System.out.println("countElemInArray null: " + countElemInArray(null, 3)); // 0
        System.out.println("firstOccurenceInArray null: " + firstOccurenceInArray(null, 3)); // -1
        System.out.println("lastOccurenceInArray null: " + lastOccurenceInArray(null, 3)); // -1
        System.out.println("uniqueArray null: " + uniqueArray(null)); // true
        System.out.println("sumOfEven null: " + sumOfEven(null)); // 0
        System.out.println("sumOfOdd null: " + sumOfOdd(null)); // 0
        System.out.println("countPrime null: " + countPrime(null)); // 0
        System.out.println("countDivisibleNum null: " + countDivisibleNum(null)); // 0
        System.out.println("countSquares null: " + countSquares(null)); // 0
    }

    //1. Input an element x — check if it exists in the array.
    private static boolean searchArray(int[] arr, int x) {
        if (arr == null) return false;

        for (int e : arr) {
            if (e == x) return true;
        }

        return false;
    }

    //2. Count how many times a given element appears.
    private static int countElemInArray(int[] arr, int x) {
        if (arr == null) return 0;

        int count=0;
        for (int e : arr) {
            if (e == x) count++;
        }

        return count;
    }

    //3. Find the first occurrence of a given number.
    private static int firstOccurenceInArray(int[] arr, int x) {
        if (arr == null) return -1;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == x) return i;
        }

        return -1;
    }

    //4. Find the last occurrence of a given number.
    private static int lastOccurenceInArray(int[] arr, int x) {
        if (arr == null) return -1;

        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] == x) return i;
        }

        return -1;
    }

    //5. Check if all elements in an array are unique.
    private static boolean uniqueArray(int[] arr) {
        if (arr == null) return true;

        HashSet<Integer> unique = new HashSet<>();
        for (int e : arr) {
            if (unique.contains(e)) {
                return false;
            }
            else {
                unique.add(e);
            }
        }

        return true;
    }

    //6. Find the sum of even elements only.
    private static int sumOfEven(int[] arr) {
        if (arr == null) return 0;

        int sum=0;
        for (int e : arr) {
            if (e%2 == 0) sum+=e;
        }

        return sum;
    }

    //7. Find the sum of odd elements only.
    private static int sumOfOdd(int[] arr) {
        if (arr == null) return 0;

        int sum=0;
        for (int e : arr) {
            if (e%2 != 0) sum+=e;
        }

        return sum;
    }

    //8. Find the count of prime numbers in the array.
    private static int countPrime(int[] arr) {
        if (arr == null) return 0;

        int count=0;
        for (int e : arr) {
            if (isPrime(e)) count++;
        }

        return count;
    }

    private static boolean isPrime(int x) {
        if (x<2) return false;

        for (int i=2; i*i<=x; i++) {
            if (x%i==0) return false;
        }

        return true;
    }

    //9. Count how many numbers are divisible by 3 and 5 both.
    private static int countDivisibleNum(int[] arr) {
        if (arr == null) return 0;

        int count=0;
        for (int e : arr) {
            if (e%3==0 && e%5==0) count++;
        }

        return count;
    }

    //10. Count how many elements are perfect squares.
    private static int countSquares(int[] arr) {
        if (arr == null) return 0;

        int count=0;
        for (int e : arr) {
            if (Math.sqrt(e)%1 == 0) count++;
        }

        return count;
    }
}
