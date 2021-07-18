package com.algo;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = getRandomArray();

        display(arr);
        bubbleSort(arr, arr.length);
        display(arr);
    }

    private static int[] getRandomArray() {
        int n = 100;
        Random rand = new Random();
        int min= 1;
        int max =  1000000;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt((max - min) + 1) + min;
        }
        return arr;
    }

    static void bubble(int[] a, int n) {
        int i = n -1;
        while (i > 0) {
            if (a[i] < a[i - 1]) {
                swap(a, i , i - 1);
            }
            i--;
        }
    }

    static void bubbleSort(int a[], int n) {
        int i = 0;
        while (i < n - 1) {
            bubble(a, n);
            i++;
        }
    }


    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void display(int[] a) {
        System.out.println();
        for (int ele :a) {
            System.out.print(ele + " ");
        }
    }
}
