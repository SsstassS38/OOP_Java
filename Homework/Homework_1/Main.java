package OOP_Java.Homework.Homework_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("americano", 125, 85));
        productList.add(new HotDrink("latte", 200, 95));
        productList.add(new HotDrink("capuchino", 250, 90));
        productList.add(new HotDrink("tea", 150, 95));
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("americano", 85));
        Product test = new HotDrink("chokolate", 123, 123);
    }
}