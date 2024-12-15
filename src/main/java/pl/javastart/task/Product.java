package pl.javastart.task;

public class Product {
    Category whichever;
    String name;
    String description;
    double price;

    Product(String na, String descr, double pr) {
        name = na;
        description = descr;
        price = pr;
    }
    void showinfo() {
        System.out.println(name + " " + description + " " + price + "zł");
        }
    }