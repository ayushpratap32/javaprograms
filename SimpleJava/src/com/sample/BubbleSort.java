package com.sample;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={9,4,1,3,5,6,8,2,7};
        bubblesort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void bubblesort(int[] arr) {

        boolean swapped=false;
        int n= arr.length;
        for(int pass=0;pass<n-1;pass++){
            for(int j=0;j<n-pass-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j+1,j);
                    swapped=true;
                }
                if(!swapped){
                    break;
                }
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
