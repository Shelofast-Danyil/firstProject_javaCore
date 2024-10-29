package lesson4.hometask;

public class CompareSums {
    public static void main(String[] args) {
        System.out.println(compareSums(1, 10, 2, 5));
        System.out.println(compareSums(1, 4, 5, 7));
        System.out.println(compareSums(54, 55, 23, 45));
        System.out.println(compareSums(43, 76, 12, 43));
    }

    public static boolean compareSums(int a, int b, int c, int d) {
        return sum(a, b) > sum(c, d);
    }

    private static int sum(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}
