/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author papaj
 */
public class Product {
    int productId;
    String name;
    String description;
    double price;
    int quantity;

    public Product(int productId, String name, String description, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ID: " + productId + ", Name: " + name + ", Description: " + description + ", Price: " + price + ", Quantity: " + quantity;
    }
}
