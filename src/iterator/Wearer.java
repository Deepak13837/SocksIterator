package iterator;

public class Wearer {
	Socks officeSocks = new OfficeSocksStore();
	Socks sportsSocks = new SportSockStore();
	
	public Wearer( Socks officeSocks , Socks sportsSocks ) { 
		this.officeSocks = officeSocks;
		this.sportsSocks = sportsSocks;
	}
	public void printSocks() {
		Iterator officeIterator = officeSocks.getIterator();
		Iterator sportsIterator = sportsSocks.getIterator();
		
		System.out.println("\n---------Office Socks----------\n");
		printSocks(officeIterator);
		System.out.println("\n---------Sports Socks----------\n");
		printSocks(sportsIterator);
	}
	public void printSocks(Iterator iterator ) {
		while(iterator.hasNext()) {
			SocksItem socksItem = iterator.next();
			System.out.print(socksItem.getName() + ", ");
			System.out.print(socksItem.getDescription() + ", ");
			System.out.print(socksItem.getLength() + ", ");
			System.out.println(socksItem.getPrice() );
		}
	}
}
