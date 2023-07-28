import java.util.*;

public class Shop {
	
	private List<Product> products;
    private Warehouse warehouse;

    public Shop(Warehouse warehouse) {
        this.products = new ArrayList<>();
        this.warehouse = warehouse;
    }

    public void  addProduct(Product product) {
    	products.add(product);
    	warehouse.addProduct(product,0);
    }

    public void removeProduct(Product product) {
    	products.remove(product);
    	warehouse.removeProduct(product,0);
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}