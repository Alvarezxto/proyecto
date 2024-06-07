/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author papaj
 */
class Node {
    Product product;
    Node next;

    public Node(Product product) {
        this.product = product;
        this.next = null;
    }
}