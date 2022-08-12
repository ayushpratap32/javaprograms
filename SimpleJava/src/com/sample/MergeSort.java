package com.sample;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr={3,5,9,8,2,1,6,7,4};
        merge_sort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void merge_sort(int[] arr, int start, int end) {

        if(start<end){
            int mid=start+(end-start)/2;
            merge_sort(arr,start,mid);
            merge_sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {

        int size1=mid-start+1;
        int size2=end-mid;

        int[] left=new int[size1];
        int[] right=new int[size2];

        for(int i=0;i<size1;i++){
            left[i]=arr[start+i];
        }

        for(int j=0;j<size2;j++){
            right[j]=arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=start;
        while(i <size1 && j<size2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
           else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
            while (i < size1) {
                arr[k] = left[i];
                i++;
                k++;
            }

            while (j < size2) {
                arr[k] = right[j];
                j++;
                k++;
            }
    }
}
