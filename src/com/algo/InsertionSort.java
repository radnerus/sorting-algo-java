package com.algo;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = getRandomArray();
        display(arr);
        insertionSort(arr, arr.length);
        display(arr);
    }

    static void insertionSort(int a[], int n) {
        int i = 1;
        while (i < n) {
            insertIth(a, n, i);
            i++;
        }
    }

    static void insertIth(int[] a, int n, int i) {
        int key = a[i];
        int j = i - 1;
        while (j >= 0 && a[j] < key) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = key;
    }

    private static int[] getRandomArray() {
        int n = 5;
        Random rand = new Random();
        int min= 1;
        int max =  10;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt((max - min) + 1) + min;
        }
        return arr;
    }

    static void display(int[] a) {
        System.out.println();
        for (int ele :a) {
            System.out.print(ele + " ");
        }
    }
}
