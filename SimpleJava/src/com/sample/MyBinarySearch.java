package com.sample;

public class MyBinarySearch {

    public static void main(String[] args) {
        int[] arr={101,201,301,601,901,1100,9111};
        int elementToSearch=9111;
        int index=(binarySearch(arr,elementToSearch))+1;
        System.out.println("element "+elementToSearch+" is available at "+index+" position.");
    }

    private static int binarySearch(int[] arr, int elementToSearch) {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if (arr[mid] == elementToSearch) {
                return mid;
            }
            if (arr[mid] > elementToSearch) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
