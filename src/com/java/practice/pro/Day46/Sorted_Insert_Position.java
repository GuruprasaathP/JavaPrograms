package com.java.practice.pro.Day46;

public class Sorted_Insert_Position {
    public static int searchInsertK(int arr[], int k) {

        int ans = 0;

        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] == k) {
                ans = i;
            }
            else if (arr[i] > k) {
                ans = i;
            }
            else {
                ans = arr.length;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 6};
        int k = 2;

        int result = searchInsertK(arr, k);

        System.out.println(result);
    }
}
