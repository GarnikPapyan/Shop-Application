import java.util.*;

public class Customer {

	private ShoppingCart shoppingCart;

    public Customer() {
        shoppingCart = new ShoppingCart();
    }

    public void addProductToCart(Product product) {
    	shoppingCart.addProduct(product);
    }


    public void removeProductFromCart(Product product) {
    	 shoppingCart.removeProduct(product);
    }

    public void purchase() {

        double totalPrice = shoppingCart.getTotalPrice();

        System.out.println("Total amount: $" + totalPrice);
        

    }


}