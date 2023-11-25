package OOP_Java.Seminars.Seminar_1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    public void initProduct(List<Product> productList);
    public Product getProduct(String name);
}
