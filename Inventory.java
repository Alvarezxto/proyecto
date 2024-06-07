/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author papaj
 */
class Inventory {
    private Node head;

    public Inventory() {
        this.head = null;
    }

    public void addProduct(Product product) {
        Node newNode = new Node(product);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean removeProduct(int productId) {
        Node current = head;
        Node previous = null;

        while (current != null && current.product.productId != productId) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            if (previous != null) {
                previous.next = current.next;
            } else {
                head = current.next;
            }
            return true;
        }
        return false;
    }

    public Product findProduct(int productId) {
        Node current = head;
        while (current != null && current.product.productId != productId) {
            current = current.next;
        }
        return current != null ? current.product : null;
    }

    public boolean updateQuantity(int productId, int quantity) {
        Product product = findProduct(productId);
        if (product != null) {
            product.quantity = quantity;
            return true;
        }
        return false;
    }

    public void displayInventory() {
        Node current = head;
        while (current != null) {
            System.out.println(current.product);
            current = current.next;
        }
    }
}
