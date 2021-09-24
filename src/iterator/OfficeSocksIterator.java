package iterator;

public class OfficeSocksIterator implements Iterator{
	SocksItem[] socksItems;
	int position = 0;
	public OfficeSocksIterator( SocksItem[] socksItems ) {
		this.socksItems = socksItems;
	}
	public boolean hasNext() {
		if( position >= socksItems.length || socksItems[position] == null) {
			return false;
		}
		else {
			return true;
		}
		
	}
	public SocksItem next() {
		SocksItem socksItem = socksItems[position];
		position = position + 1;
		return socksItem;
	}
	
}
