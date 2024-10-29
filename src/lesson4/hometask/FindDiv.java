package lesson4.hometask;

public class FindDiv {
    public static void main(String[] args) {
        System.out.println(FindDivCount((short) 1, (short) 12, 3));
    }

    public static int FindDivCount(short a, short b, int n) {
        int count = 0;
        if (0 <= a && 0 <= b && n > 0) {
            for (int i = a; i <= b; i++) {
                if (i % n == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
