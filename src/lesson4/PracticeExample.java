package lesson4;

public class PracticeExample {

    public static void main(String[] args) {

        System.out.println(count(10, 50, 0));
        System.out.println(count(10, 50, 3));
    }

    public static int min(int a, int b, int c) {
        int i = a < b ? a : b;
        return i < c ? i : c;
    }

    public static double average(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return (double) sum / n;
    }

    public static double average(int a, int b) {
        // 2 - 5 {1 2 3 4} b - a + 1
        int suma = 0;
        for (int i = a; i <= b; i++) {
            suma += i;
        }
        return (double) suma / (b - a + 1);
    }

    public static double count(int a, int b, int n) {
        double index = 0;
        for (int i = a; i <= b; i++) {
            if (i % 10 == n) {
                index++;
            }
        }
        return index;
    }
}
