package lesson5;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arrays = new int[]{33, 2, 0, 1, 2, 1, 5, 22, 3, 0, 0};
        //System.out.println(Arrays.toString(sortAscending(arrays)));
        //System.out.println(Arrays.toString(sortDescending(arrays)));
        //System.out.println(Arrays.toString(sortArrays(arrays)));

    }

    public static int[] sortAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] >= arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static int[] sortDescending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] <= arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;

    }

}
