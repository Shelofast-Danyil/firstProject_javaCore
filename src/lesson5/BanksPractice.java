package lesson5;

import java.util.Arrays;

public class BanksPractice {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Max", "Irina"};
        int[] balance = {100, -500, 1000, -100, 21212, 4444444};

        System.out.println(Arrays.toString(findClientsByBalance(names, balance, 10000)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balance)));
        System.out.println(Arrays.toString(balance));

    }

    public static String[] findClientsByBalance(String[] clients, int[] balances, int n) {

        int count = 0;
        for (int balance : balances) {
            if (balance >= n) {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance >= n) {
                result[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }

        return result;
    }

    public static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {

        int count = 0;
        for (int balance : balances) {
            if (balance < 0) {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;
        int resIndex = 0;
        for (int balance : balances) {
            if (balance < 0) {
                result[resIndex] = clients[index];
                resIndex++;
            }
            index++;
        }

        return result;
    }

    public static void depositMoney(String[] clients, int[] balances, String client, int money) {

        int moneyToDeposit = calculate(money);
        balances[findClientIndexByName(clients, client)] += moneyToDeposit;

    }


    private static int findClientIndexByName(String[] clients, String client) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }

    private static int calculate(int money) {
        return (int) (money <= 100 ? money - money * 0.02 : money - money * 0.01);
    }
}
