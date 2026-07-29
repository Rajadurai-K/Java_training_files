import java.util.LinkedList;

public class ShoppingCartLinkedList {
    public static void main(String[] args) {

        // Create a LinkedList to store product names
        LinkedList<String> cart = new LinkedList<>();

        // Add 3 products
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");

        System.out.println("Initial Shopping Cart:");
        System.out.println(cart);

        // Add a product at the beginning
        cart.addFirst("Smartphone");
        System.out.println("\nAfter addFirst():");
        System.out.println(cart);

        // Add a product at the end
        cart.addLast("Headphones");
        System.out.println("\nAfter addLast():");
        System.out.println(cart);

        // Display the first product
        System.out.println("\nFirst Product: " + cart.getFirst());

        // Display the last product
        System.out.println("Last Product: " + cart.getLast());

        // Remove the first product
        cart.removeFirst();
        System.out.println("\nAfter removeFirst():");
        System.out.println(cart);

        // Remove the last product
        cart.removeLast();
        System.out.println("\nAfter removeLast():");
        System.out.println(cart);

        // Display the final shopping cart
        System.out.println("\nFinal Shopping Cart:");
        System.out.println(cart);
    }
}