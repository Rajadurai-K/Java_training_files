import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {

        // Create an ArrayList to store product names
        ArrayList<String> cart = new ArrayList<>();

        // Add 5 products to the cart
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("Monitor");
        cart.add("Headphones");

        // Display all products
        System.out.println("Products in the cart:");
        System.out.println(cart);

        // Display the product at index 2
        System.out.println("\nProduct at index 2: " + cart.get(2));

        // Replace the product at index 1
        cart.set(1, "Printer");
        System.out.println("\nAfter replacing product at index 1:");
        System.out.println(cart);

        // Remove one product from the cart
        cart.remove(3);   // Removes "Monitor"
        System.out.println("\nAfter removing one product:");
        System.out.println(cart);

        // Find the total number of products
        System.out.println("\nTotal number of products: " + cart.size());

        // Check whether "Laptop" is available
        if (cart.contains("Laptop")) {
            System.out.println("\nLaptop is available in the cart.");
        } else {
            System.out.println("\nLaptop is not available in the cart.");
        }

        // Clear all products
        cart.clear();

        // Display the final cart
        System.out.println("\nFinal cart:");
        System.out.println(cart);
    }
}