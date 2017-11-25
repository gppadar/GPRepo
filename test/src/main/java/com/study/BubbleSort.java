package com.study;

/**
 * Created by ganesh on 10/6/17.
 */
public class BubbleSort {

    public static void main(String[]args){
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_sort(input);
    }

    public static void bubble_sort(int[] inputArray){
        int arrLength = inputArray.length;
        for(int i=0;i<arrLength;i++){
            for(int j=0; j<arrLength-1;j++){
                if(inputArray[j] > inputArray[j+1]){
                    swapNumbers(j, j+1,inputArray);
                }
            }
            printArray(inputArray);
        }
    }

    public static void swapNumbers(int i, int j, int[] array){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array){
        System.out.println("");
        for(int i=0;i<array.length; i++){
            System.out.print(" "+array[i]);
        }
    }
}
