import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Warehouse warehouse = new Warehouse();
        Shop shop = new Shop(warehouse);

        Product phone = new PhysicalProduct("iPhone 12 Max", 999.9, 0.5);
        Product computer = new PhysicalProduct("MAC", 1800, 1.8);
        Product tv = new DigitalProduct("SONY", 1750.0, 180);

		shop.addProduct(phone);
		shop.addProduct(computer);
        shop.addProduct(tv);
      

        Customer customer = new Customer();

        customer.addProductToCart(phone);
        customer.addProductToCart(tv);
        customer.addProductToCart(phone);   
        customer.addProductToCart(computer); 


        customer.purchase();
	} 
}