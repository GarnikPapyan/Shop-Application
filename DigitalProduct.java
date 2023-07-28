public class DigitalProduct extends Product {

	private double size;

	public DigitalProduct(String name, double price, double size) {

		super(name,price);
		this.size = size;

	}

	public double getDownloadSize() {
		return size;
	}
	
}