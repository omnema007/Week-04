package collectionframework.implementashoppingcart;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products
        cart.addProduct("Laptop", 1000.0);
        cart.addProduct("Phone", 500.0);
        cart.addProduct("Headphones", 100.0);

        // Adding items to cart
        cart.addToCart("Laptop");
        cart.addToCart("Phone");
        cart.addToCart("Headphones");
        cart.addToCart("Laptop");

        // Display cart order
        cart.displayCartOrder();

        // Display sorted products by price
        cart.displaySortedByPrice();
    }
}
