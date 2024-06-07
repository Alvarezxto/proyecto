/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author papaj
 */
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Agregar productos
        inventory.addProduct(new Product(1, "Laptop", "Laptop 15''", 900.000, 10));
        inventory.addProduct(new Product(2, "Mouse", "Wireless Mouse", 25.000, 50));
        inventory.addProduct(new Product(3, "Keyboard", "Mechanical Keyboard", 75.000, 30));
        inventory.addProduct(new Product(4, "pantalla", "pantalla grande", 900.000, 15));
        // Mostrar inventario inicial
        System.out.println("Inventario inicial:");
        inventory.displayInventory();

        // Buscar un producto
        System.out.println("\nBuscar Mouse:");
        Product product = inventory.findProduct(2);
        if (product != null) {
            System.out.println("Encontrado: " + product.name + ", Cantidad: " + product.quantity);
        } else {
            System.out.println("Producto no encontrado");
        }

        // Actualizar cantidad
        inventory.updateQuantity(2, 47);

        // Mostrar inventario después de actualizar cantidad
        System.out.println("\nInventario después de actualizar cantidad:");
        inventory.displayInventory();

        // Eliminar producto
        inventory.removeProduct(3);

        // Mostrar inventario final
        System.out.println("\nInventario después de eliminar un producto:");
        inventory.displayInventory();
    }
}
