package iterator;

public class SocksItem {
	String name;
	String description;
	int length;
	double price;
	public SocksItem(String name , String description, int length, double price ) {
		this.name = name;
		this.description = description;
		this.length = length;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description; 
	}
	public int getLength() {
		return length;
	}
	public double getPrice() {
		return price;
	}
}
