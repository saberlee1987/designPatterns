package com.saber.test1.sort;

import java.util.Arrays;

// 9 8 7 6 5 4 3 2 1
public class MergeSort {
    public void sort(int[] numbers) {
        if (numbers.length < 2) return;

        int middle = numbers.length / 2;
        int[] left = new int[middle];
        int[] right = new int[numbers.length - middle];
        for (int i = 0; i < middle; i++) {
            left[i] = numbers[i];
        }
        for (int i = middle; i < numbers.length; i++) {
            right[i - middle] = numbers[i];
        }
        System.out.println("left  ==>  "+Arrays.toString(left));
        System.out.println("right ==> "+Arrays.toString(right));
        System.out.println("==========================");
        sort(left);
        sort(right);
        merge(left,right,numbers);
        System.out.println("left  ==>  "+Arrays.toString(left));
        System.out.println("right ==> "+Arrays.toString(right));
        System.out.println("result ===> "+Arrays.toString(numbers));
        System.out.println("==========================");
    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }

    private void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
