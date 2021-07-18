package com.algo;

import java.util.Random;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Please enter a number N:");

        n = scanner.nextInt();
        Random rand = new Random();
        int min= 1;
        int max =  100;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt((max - min) + 1) + min;
        }

        System.out.println("Input Array\n");
        for (int ele : arr) {
            System.out.println(ele);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\n\nSorted Array Array\n");

        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
