public class PhysicalProduct extends Product {
	
	private double weight;

	public PhysicalProduct (String name, double price, double weight) {

		super(name,price);
		this.weight = weight;

	}

	public double getShippingWeight() {
        return weight;
    }
}