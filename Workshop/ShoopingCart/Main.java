package Workshop.ShoopingCart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static class Product {
        private String name;
        private double price;
        private String category;

        public double getPrice() {
            return price;
        }


        public Product(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        @Override
        public String toString() {
            return name + " " + category + " " + price;
        }
    }

    static class Cart {
        private List<Product> items;

        public Cart() {
            items = new ArrayList<>();
        }

        public void addItem(Product product) {
            items.add(product);
        }

        public void removeItem(Product product) {
            items.remove(product);
        }

        public double calculateTotalCost() {
            double total = 0;
            for (Product item : items) {
                total += item.getPrice();
            }
            return total;
        }

    }

    static class Order {
        private Cart cart;

        public Order(Cart cart) {
            this.cart = cart;
        }

        public void checkout() {
            double totalCost = cart.calculateTotalCost();
            System.out.println("Total Price " + totalCost);
        }
    }
}
