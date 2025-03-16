package lesson5;

import java.util.Arrays;

public class Withdraw {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Max", "Irina"};
        int[] balances = {100, -500, 100, -100, 21212, 4444444};
        withdraw(names, balances, "Denis", 1000);
        System.out.println(Arrays.toString(balances));

    }

    public static int withdraw(String[] clients, int[] balances, String client, int money) {
        int moneyToDeposit = money > balances[findClientIndexByName(clients, client)] ? -1 : balances[findClientIndexByName(clients, client)] - money;
        return balances[findClientIndexByName(clients, client)] = moneyToDeposit;
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
}
