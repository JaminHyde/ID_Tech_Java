package Lecture.Streams.Examples;

import java.util.*;


public class CustomerOrder {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Product A", 2));
        orders.add(new Order("Product B", 3));
        orders.add(new Order("Product C", 1));
        orders.add(new Order("Product A", 5));
        orders.add(new Order("Product B", 2));

        int totalItems = orders.stream()
                .mapToInt(Order::getQuantity)
                .sum();

        System.out.println("Total items ordered: " + totalItems);
    }
}

class Order {
    private String productName;
    private int quantity;

    public Order(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
