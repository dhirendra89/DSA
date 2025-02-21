package org.wolf.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortList {

    public static void mergeSort(ArrayList<Integer> list, int left, int right) {

        // base-condition
        if (list.size() == 1) {
            return;
        }

        int mid = (int) Math.floor((double) (left + right) / 2);
        ArrayList<Integer> l_arr = new ArrayList<>(list.subList(left, mid + 1));
        ArrayList<Integer> r_arr = new ArrayList<>(list.subList(mid + 1, right + 1));
        //list.();

        // hypothesis
        mergeSort(l_arr, 0, l_arr.size() - 1);
        mergeSort(r_arr, 0, r_arr.size() - 1);

        // a -> a+1
        int index = 0;
        for (int i = 0; i < l_arr.size(); ) {
            for (int j = 0; j < r_arr.size(); ) {
                if (l_arr.get(i) < r_arr.get(j)) {
                    list.set(index, l_arr.get(i));
                    i++;

                    if (i > l_arr.size() - 1) {
                        for (int k = j; k < r_arr.size(); k++) {
                            list.set(++index, r_arr.get(k));
                            j++;
                        }
                    }
                } else {
                    list.set(index, r_arr.get(j));
                    j++;

                    if (j > r_arr.size() - 1) {
                        for (int k = i; k < l_arr.size(); k++) {
                            list.set(++index, l_arr.get(k));
                            i++;
                        }
                    }
                }
                index++;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{2, 1, 4, 3}));
        mergeSort(list, 0, list.size() - 1);
        list.forEach(ele -> System.out.print(ele + " "));
    }
}
