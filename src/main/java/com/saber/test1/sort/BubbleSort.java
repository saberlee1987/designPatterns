package com.saber.test1.sort;

import java.util.Arrays;

// 9 8 7 6 5 4 3 2 1
public class BubbleSort {
    public void sort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                System.out.println("numbers[i] ==> " + numbers[i]);
                System.out.println("numbers[j] ==> " + numbers[j]);
                if (numbers[i] > numbers[j]) {
                    swap(numbers, i, j);
                    System.out.println(Arrays.toString(numbers));
                    System.out.println("===============");
                }
            }
        }
    }

    private void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
