package com.algo;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int n = 10;
        Random rand = new Random();
        int min= 1;
        int max =  100;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt((max - min) + 1) + min;
        }

        display(arr);

        selectionSort(arr, arr.length);

        display(arr);
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void selectionSort(int[] a, int n) {
        int i = 0;
        while (i < n - 1) {
            int j = locationOfSmallest(a, i, n-1);
            swap(a, i, j);
            i++;
        }
    }

    static int locationOfSmallest(int[] a, int s, int e) {
        int i = s;
        int j = i;
        while (i <= e) {
            if (a[i] < a[j]) {
                j = i;
            }
            i++;
        }

        return j;
    }

    static void display(int[] a) {
        System.out.println();
        for (int ele :a) {
            System.out.print(ele + " ");
        }
    }
}
