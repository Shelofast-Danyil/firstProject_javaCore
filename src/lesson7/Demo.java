package lesson7;

import lesson6.homework.Deal;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        System.out.println(createDeal(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy"));
        System.out.println(createDealAndCallMethods(100, new Date(), true, new Date(), "Kyiv", "Ukraine", "SomeValue"));
    }

    public static Deal createDeal(int price, Date dataCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        return new Deal(price, dataCreated, isConfirmed, dateConfirmed, city, country, type);
    }

    public static Deal createDealAndCallMethods(int price, Date dataCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        Deal deal = new Deal(price, dataCreated, isConfirmed, dateConfirmed, city, country, type);
        deal.isValidType();
        deal.confirmOrder();
        deal.checkPrice();
        return deal;
    }
}
