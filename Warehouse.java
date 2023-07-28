import java.util.*;

public class Warehouse {
	private Map<Product, Integer> productQuantityMap;

	public Warehouse () {
		productQuantityMap = new HashMap<>();
	}

	public void addProduct(Product product, int quantity) {

		int currentQuantity = productQuantityMap.getOrDefault(product, 0);
        productQuantityMap.put(product, currentQuantity + quantity);
	}

	public void  removeProduct(Product product, int quantity) {
		
		int currentQuantity = productQuantityMap.get(product);
        int updatedQuantity = Math.max(0, currentQuantity - quantity);
        productQuantityMap.put(product, updatedQuantity);
	}

	public int getProductQuantity(Product product) {
        return productQuantityMap.get(product);
    }
}