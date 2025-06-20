package com.saber.test1.sort;

import java.util.Arrays;

// 9 8 7 6 5 4 3 2 1
public class SelectionSort {
    public void sort(int[] numbers) {
        int minIndex;
        for (int i = 0; i < numbers.length; i++) {
            minIndex = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    minIndex = j;
                }
            }
            swap(numbers, i, minIndex);
            System.out.println("minIndex ===> "+minIndex);
            System.out.println(Arrays.toString(numbers));
            System.out.println("==========================");
        }
    }

    private void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
