package Workshop.ShoopingCart;

import java.util.ArrayList;
import java.util.List;

public class OnlineShooping extends Main {
    
        public static void main(String[] args) {
            Product laptop = new Product("Laptop", 70000.0, "Electronics");
            Product shirt = new Product("T-Shirt", 800.0, "Clothing");

            Cart myCart = new Cart();
            myCart.addItem(laptop);
            myCart.addItem(shirt);

            Order myOrder = new Order(myCart);
            myOrder.checkout();
        }

}