package org.wolf.sorting;

import java.sql.SQLOutput;

public class BubbleSort {

    // https://learning.heycoach.in/student/super-30---january-2025/sessions/Bubble-Sort-4333
    public String findWinner(int[] Anish, int[] Binish) {

        int swap_count_a = swapCount(Anish);
        int swap_count_b = swapCount(Binish);

        if(swap_count_a < swap_count_b){
            System.out.println("Anish");
        }else if(swap_count_b < swap_count_a){
            System.out.println("Binish");
        }else{
            System.out.println("Tie");
        }

        return "";
    }

    private static int swapCount(int[] arr) {
        int swap_count = 0;
        boolean swapped = false;

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                    swap_count++;
                }
            }
            if(!swapped){
                break;
            }
        }
        return swap_count;
    }

    public static void main(String[] args) {

    }
}
