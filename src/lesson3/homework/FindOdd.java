package lesson3.homework;

public class FindOdd {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 1) {
                System.out.println("Found");
                sum += i;
            }
        }
        if (sum * 5 > 5000) {
            System.out.println("Bigger");
        } else {
            System.err.println("Smaller or equal");
        }
    }
}
