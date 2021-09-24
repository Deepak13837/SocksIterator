package iterator;

public class SocksIterator {

	public static void main(String[] args) {
		Socks officeSocks = new OfficeSocksStore();
		Socks sportSocks = new SportSockStore();
		
		Wearer wearer = new Wearer( officeSocks, sportSocks);
		
		wearer.printSocks();

	}

}
