package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("Pieczywa,", "co rano świeżo przywożone z pobliskiej piekarni");

        Product product1 = new Product("Chleb", "z mąki pszennej", 6.50);
        product1.whichever = category1;

        Product product2 = new Product("Grahamki,","z dużą zawartością witamin i składników naturalnych, jedna sztuka już od", 0.60);
        product2.whichever = category1;

        category1.showinfo();
        product1.showinfo();
        product2.showinfo();

        Category category2 = new Category("Napoje", "niegazowane, lekko gazawane lub gazowane");

        Product product3 = new Product("Pepsi Zero","bez cukru i sztucznych słodzików", 10);
        product3.whichever = category2;

        category2.showinfo();
        product3.showinfo();

        Product product4 = new Product("Marsjanki","witaminy dla dzieci poprawiające odporność. Cena za jedno opakowanie",15.20 );
        product4.whichever = null;

        product4.showinfo();

        Product product5 = new Product("Dowolny produkt","ze zniżką",  (double) 0 /20);

        SpecialOffer specialOffer = new SpecialOffer("Do wygrania kupon zniżkowy na dowolny produkt.Do otrzymania przy zakupach za minimum 20zł","Oferta ważna od 01.12.2024 - 01.01.2025",20);
        specialOffer.anyProduct = product5;
        specialOffer.print();
    }
}
