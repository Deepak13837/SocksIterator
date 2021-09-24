package iterator;
import java.util.*;
public class SportSockIterator implements Iterator{
	List<SocksItem> socksItems;
	int length;
	
	public SportSockIterator(List<SocksItem> socksItems ) {
		this.socksItems = socksItems;
	}
	public boolean hasNext() {
		if(length >= socksItems.size()) {
			return false;
		}
		else {
			return true;
		}
	}
	public SocksItem next() {
		SocksItem socksItem = socksItems.get(length);
		length = length + 1;
		return socksItem;
	}
}
