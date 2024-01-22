package homeworks.homework4;

public class Store {

    int PriceProductA;
    int PriceProductB;
    int Discount;

    public Store(int priceProductA, int priceProductB, int discount) {
        PriceProductA = priceProductA;
        PriceProductB = priceProductB;
        Discount = discount;
    }

    public void printPrices (){
        int PriceWithDiscount = PriceProductA + PriceProductB - Discount;
        System.out.println("Discount on your purchase: " + Discount);
        System.out.println("the costs of products A and B with discount: " + PriceWithDiscount);
    }
}
