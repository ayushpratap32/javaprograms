package com.sample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = insertionSort(new int[]{9, 4, 6, 1, 3, 5, 7, 2, 4, 8});
        Arrays.stream(arr).forEach(System.out::println);

    }

    private static int[] insertionSort(int[] arr) {

        int n = arr.length;

        for(int pass=1;pass<n;pass++){
            int temp_min=arr[pass];
            int j=pass-1;
            while(j>=0 && arr[j]>temp_min){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp_min;
        }
        return arr;
    }

}
