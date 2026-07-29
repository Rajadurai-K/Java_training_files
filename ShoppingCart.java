import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {

        ArrayList<String> cart = new ArrayList<>();

        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("Monitor");
        cart.add("Headphones");

        System.out.println("Products in the cart:");
        System.out.println(cart);

        System.out.println("\nProduct at index 2: " + cart.get(2));
        cart.set(1, "Printer");

        System.out.println("\nAfter replacing product at index 1:");
        System.out.println(cart);
        cart.remove(3);  

        System.out.println("\nAfter removing one product:");
        System.out.println(cart);

        System.out.println("\nTotal number of products: " + cart.size());
        if (cart.contains("Laptop")) {
            System.out.println("\nLaptop is available in the cart.");
        } else {
            System.out.println("\nLaptop is not available in the cart.");
        }

        cart.clear();

        System.out.println("\nFinal cart:");
        System.out.println(cart);
    }
}