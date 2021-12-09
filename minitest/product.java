package minitest;

import java.io.PrintWriter;

public class product {
    private String item;
    private String name;
    private double price;
    private String type;
    private String currency = "USD";

    public product(String item, String name, double price, String type, String currency) {
        this.item = item;
        this.name = name;
        this.price = price;
        this.type = type;
        this.currency = currency;
    }

    public String getItem() {
        return item;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
