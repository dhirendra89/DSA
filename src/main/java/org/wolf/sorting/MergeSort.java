package org.wolf.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {

        // base-condition
        if (arr.length == 1) {
            return;
        }

        int mid = (int) Math.floor((double) (left + right) / 2);
        int[] l_arr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] r_arr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        // hypothesis
        mergeSort(l_arr, 0, l_arr.length - 1);
        mergeSort(r_arr, 0, r_arr.length - 1);

        // a -> a+1
        int index = 0;
        for (int i = 0; i < l_arr.length; ) {
            for (int j = 0; j < r_arr.length; ) {
                if (l_arr[i] < r_arr[j]) {
                    arr[index] = l_arr[i];
                    i++;

                    if (i > l_arr.length - 1) {
                        for (int k = j; k < r_arr.length; k++) {
                            arr[++index] = r_arr[k];
                            j++;
                        }
                    }
                } else {
                    arr[index] = r_arr[j];
                    j++;

                    if (j > r_arr.length - 1) {
                        for (int k = i; k < l_arr.length; k++) {
                            arr[++index] = l_arr[k];
                            i++;
                        }
                    }
                }
                index++;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 4, 3, 6, 7, 16, 13, 12, 99, 0, -1, -3, -99, -3, 2, 2, 55, 77, 22};
        mergeSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));
    }
}
