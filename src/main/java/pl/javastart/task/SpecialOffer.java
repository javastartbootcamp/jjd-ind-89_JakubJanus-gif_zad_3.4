package pl.javastart.task;

public class SpecialOffer {
    Product anyProduct;
    String ofertDescription;
    String validityPeriod;
    double discount;

    SpecialOffer(String oD, String vP, double dis) {
        ofertDescription = oD;
        validityPeriod = vP;
        discount = dis;
    }
    void print() {
        System.out.println(ofertDescription + ": " + validityPeriod + ":" + " " + "Wysokość zniżki: " + discount + "%");

    }
}
