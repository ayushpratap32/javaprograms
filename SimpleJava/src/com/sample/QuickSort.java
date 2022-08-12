package com.sample;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr={9,4,8,3,7,5,6,1,2};
        quicksort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void quicksort(int[] arr, int start, int end) {

        if(start<end){
            int partition = partitionwithlastaspivot(arr, start, end);
           // int partition=partitionwithfirstaspivot(arr,start,end);
            quicksort(arr,start,partition-1);
            quicksort(arr,partition+1,end);
        }
    }

    private static int partitionwithfirstaspivot(int[] arr, int start, int end) {
        int pivot=arr[start];
        int i=start;
        int j=end;

        while(i<j){
            //stop first pointer at element which is greater than pivot
            while(i<=j && arr[i]<=pivot){
                i++;
            }

            //stop second pointer at element which is smaller than pivot
            while(arr[j]>pivot){
                j--;
            }

            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,start,j);
        return j;
    }

    private static int partitionwithlastaspivot(int[] arr, int start, int end) {
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }


    private static void swap(int[] arr, int i, int j) {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
