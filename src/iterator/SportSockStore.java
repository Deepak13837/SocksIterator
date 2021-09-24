package iterator;
import java.util.*;
public class SportSockStore implements Socks{
	List<SocksItem> socksItems;
	
	public SportSockStore( ) {
		socksItems = new ArrayList<SocksItem>();
		addSocks("Athletic Mens Sports ", " This is a quarter running Mens sports socks which feature the heel and toe area with special design to prevent any blisters.  ", 3, 23);
		addSocks("Blue with Red Hoops sports ", " It is the best and ideal knee high sport socks wear for outdoor games ", 3, 19);
		addSocks("Girls Sexy Sports ", " These womens long sports socks are meant for the games like football. ", 3, 10);
		addSocks("Hidden Contour Womens Sports  ", " This is an athletic running sock which is unisex and readily used as womens sports socks ", 3, 20);
	}
	private void addSocks(String name, String description , int length, double price ) {
		SocksItem socksItem = new SocksItem(name, description, length, price );
		socksItems.add(socksItem);
	}
	public Iterator getIterator() {
		return new SportSockIterator(socksItems);
	}
	public List<SocksItem> getSocks(){
		return socksItems;
	}
	
	
}
