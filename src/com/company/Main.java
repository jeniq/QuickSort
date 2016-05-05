package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    
    }

    public static void quickSort(int[] array, int start, int end){
        if (start < end){
            int q = partition(array, start, end);
            quickSort(array, start, q - 1);
            quickSort(array, q + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end){
        int x = array[end]; // set support element
        int i = start - 1;
        for (int j = start; j < end; j++){
            if (array[j] <= x){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, end, i+1);
        return i + 1; // index of support element
    }

    public static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
