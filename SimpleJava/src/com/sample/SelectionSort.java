package com.sample;

import java.util.Arrays;

//takes minimum swaps ,useful if swaps are expensive
public class SelectionSort {

    public static void main(String[] args) {
        int[] out = mySelectionSort(new int[]{8, 2, 7,4});//{8, 2, 7, 4, 9, 5, 1, 6, 3}
        Arrays.stream(out).forEach(System.out::print);
    }


    public static int[] mySelectionSort(int[] inarr) {

        int n= inarr.length;

        for(int pass=0;pass<n-1;pass++){
            int min=pass;
            for(int j=pass+1;j<n;j++){
                if(inarr[j]<inarr[min]){
                    min=j;
                }
            }
            swap(inarr,pass,min);
        }
        return inarr;
    }


    private static void swap(int[] inarr, int i, int min_ele_index) {
        int temp = inarr[i];
        inarr[i] = inarr[min_ele_index];
        inarr[min_ele_index] = temp;
    }

}
