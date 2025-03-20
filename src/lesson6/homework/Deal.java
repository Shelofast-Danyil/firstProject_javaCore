package lesson6.homework;

import java.util.Date;

public class Deal {

    long id;
    int price;
    Date dataCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Deal(int price, Date dataCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dataCreated = dataCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Deal() {

    }

    public void confirmOrder() {
        if (!isConfirmed) {
            dateConfirmed = new Date();
            isConfirmed = true;
        }
    }

    public boolean checkPrice() {
        return price >= 1000;
    }

    public boolean isValidType() {
        return type == "Buy" || type == "Sale";
    }

}
