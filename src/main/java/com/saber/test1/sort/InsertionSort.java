package com.saber.test1.sort;

import java.util.Arrays;

// 9 8 7 6 5 4 3 2 1
public class InsertionSort {
    public void sort(int[] numbers) {
        int current;
        int j;
        for (int i = 1; i < numbers.length; i++) {
            current = numbers[i];
            j = i - 1;
            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
                System.out.println(Arrays.toString(numbers));
            }
            numbers[j + 1] = current;
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
