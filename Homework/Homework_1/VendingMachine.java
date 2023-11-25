package OOP_Java.Homework.Homework_1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    public void initProduct(List<Product> productList);
    public Product getProduct(String name);
}

