package com.algo;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = getRandomArray();

        display(arr);
        mergeSort(arr, arr.length);
        display(arr);
    }

    static void mergeSort(int[] a, int n) {
        mergeSort(a, 0, n - 1);
    }

    static void mergeSort(int[] a, int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;
        mergeSort(a, s, mid);
        mergeSort(a, mid + 1, e);
        combine(a, s, mid, e);
    }

    static void combine(int a[], int s, int m, int e) {
        int[] buffer = new int[e + 1];

        int k = s;
        while (k <= e) {
            buffer[k] = a[k];
            k++;
        }

        int i = s;
        int j = m + 1;
        k = s;

        while(i <= m && j <= e) {
            if (buffer[i] <= buffer[j]) {
                a[k] = buffer[i];
                i++;
            } else {
                a[k] = buffer[j];
                j++;
            }
            k++;
        }

        while (i <= m) {
            a[k] = buffer[i];
            i++;
            k++;
        }

        while (j <= e) {
            a[k] = buffer[j];
            j++;
            k++;
        }
    }

    private static int[] getRandomArray() {
        int n = 50;
        Random rand = new Random();
        int min = 1;
        int max = 5000;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt((max - min) + 1) + min;
        }
        return arr;
    }

    static void display(int[] a) {
        System.out.println();
        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }
}
