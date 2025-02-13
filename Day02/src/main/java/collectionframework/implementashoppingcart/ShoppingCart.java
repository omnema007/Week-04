package collectionframework.implementashoppingcart;
import java.util.*;

public class ShoppingCart {
    public final HashMap<String, Double> productPrices;
    public final LinkedHashMap<String, Integer> cartOrder;

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cartOrder = new LinkedHashMap<>();
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addToCart(String product) {
        if (productPrices.containsKey(product)) {
            cartOrder.put(product, cartOrder.getOrDefault(product, 0) + 1);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void displayCartOrder() {
        System.out.println("Items in cart (in order added):");
        for (Map.Entry<String, Integer> entry : cartOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> Quantity: " + entry.getValue());
        }
    }

    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedProducts = new TreeMap<>();
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            sortedProducts.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Products sorted by price:");
        for (Map.Entry<Double, String> entry : sortedProducts.entrySet()) {
            System.out.println(entry.getValue() + " -> Price: " + entry.getKey());
        }

    }
}
