package iterator;

public class OfficeSocksStore implements Socks{
	SocksItem[] socksItems;
	static final int MAX_ITEMS = 12;
	int position = 0;
	public OfficeSocksStore( ) {
		socksItems = new SocksItem[MAX_ITEMS];
		addItem("Gold Toe Metropolitan", "This nylon blended, well-priced sock is the workhorse of any gentleman who must wear a suit every day.", 21, 100);
		addItem("Uniqlo Mens", "These are ideal for wear with dressier sneakers like a Common Projects Achilles or a simple Nike blazer,", 21, 12.90);
		addItem("Falk Airport wool blend", "They’re made in Germany from lightweight merino wool, with cotton, nylon and elastane for comfort and stretchiness.", 20, 30);
		addItem("Paul Smith Three Pack", "They’re made from a blend of organic cotton for softness and comfort, and nylon and elastane for stretchiness.", 20, 30);
	}
	private void addItem(String name, String description, int length, double price) {
		SocksItem socksItem = new SocksItem(name, description, length, price);
		socksItems[position] = socksItem;
		position = position + 1;
	}
	public Iterator getIterator() {
		return new OfficeSocksIterator(socksItems);
	}
	public SocksItem[] getSocks() {
		return socksItems;
	}
	public String toString() {
		return "Office Socks";
	}
	
}
