package lesson5;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 4, 6, 10, 100, 21, 212, 1};
        System.out.println(maxElement(array));
        System.out.println(nCount(array,2));

    }

    public static int maxElement(int[] array) {
        int max = array[0];

        for (int el : array) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }

    public static int nCount(int[] array, int n) {
        int count = 0;

        for (int el : array) {
            if (el == n) {
                count++;
            }
        }
        return count;
    }

}
