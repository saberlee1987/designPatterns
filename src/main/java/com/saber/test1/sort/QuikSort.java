package com.saber.test1.sort;

// 9 8 7 6 5 4 3 2 1
public class QuikSort {
    public void sort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
    }

    private void sort(int[] array, int start, int end) {
        if (start >= end) return;
        int boundary = partition(array, start, end);
        sort(array, start, boundary - 1);
        sort(array, boundary, end);
    }

    private int partition(int[] array, int start, int end) {
        int boundary = start - 1;
        int pivot = array[end];
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot)
                swap(array, i, ++boundary);
        }
        return boundary;
    }

    private void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
