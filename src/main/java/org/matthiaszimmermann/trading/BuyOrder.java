package org.matthiaszimmermann.trading;

/**
 * Buy orders for the demo trading platform.
 */
public class BuyOrder extends Order {
	
	public BuyOrder(String symbol, int quantity, double price) {
		super(symbol, quantity, price);
		type = Type.BUY;
	}

	/**
	 * Comparator that sorts buy orders by (1) descending price (2) increasing time stamps. 
	 */
	public int compareTo(Order o) {
		int sig = (int) Math.signum(o.getPrice() - getPrice());
		
		if(sig != 0) {
			return sig;
		}
		
		return getTimestamp().compareTo(o.getTimestamp());
	}
}
