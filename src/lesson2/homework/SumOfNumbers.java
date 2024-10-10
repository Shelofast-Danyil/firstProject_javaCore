package lesson2.homework;

public class SumOfNumbers {
    public static void main(String[] args) {
        long suma = 0;
        for (long i = 0; i <= 10000000; i++) {
            suma += i;
        }
        System.out.println(suma);

    }
}
