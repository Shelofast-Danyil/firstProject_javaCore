package lesson5;


import java.util.Arrays;

public class UniqueCount {
    public static void main(String[] args) {
        int[] arr = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11};
        System.out.println(uniqueCount(arr));
        System.out.println(Arrays.toString((arr)));
    }

    public static int uniqueCount(int[] arr) {

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

        int[] uniqueArray = new int[arr.length];

        int uniqueCount = 0;
        for (int i : arr) {
            boolean checkUnique = false;
            for (int j : uniqueArray) {
                if (i == j) {
                    checkUnique = true;
                    break;
                }
            }

            if (!checkUnique) {
                uniqueArray[uniqueCount] = i;
                uniqueCount++;
            }

        }

        return uniqueCount;
    }
}
