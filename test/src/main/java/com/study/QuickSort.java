package com.study;

/**
 * Created by ganesh on 10/6/17.
 */
public class QuickSort {
    int[] array;
    int length;

    public QuickSort(int[] array) {
        this.array = array;
        this.length = array.length;
    }

    public static void main(String[] args) {
        int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        QuickSort sorter = new QuickSort(input);
        sorter.quickSort(0, input.length - 1);
        for (int i : sorter.array) {
            System.out.println(i + "");
        }


    }

    public static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        while (i < j) {
            while (array[i] < pivot)
                i++;

            System.out.println("i:" + i);

            while (array[j] > pivot)
                j--;
            System.out.println("j:" + j);

            if (i <= j) {
                swapNumbers(i, j, array);
                i++;
                j--;
            }
        }

        System.out.println("i:" + i + " j:" + j);
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }
}
