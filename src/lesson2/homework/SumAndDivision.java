package lesson2.homework;

public class SumAndDivision {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        while (a < 10000) {
            a++;
            sum += a;
        }

        int unit = sum / 1234;
        int rest = sum % 1234;

        System.out.println(unit < rest);
    }
}
