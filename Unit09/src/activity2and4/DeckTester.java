package activity2and4;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] suits = {"clubs", "diamonds", "hearts", "spades"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck d = new Deck(ranks, suits, values);
		System.out.println(d.isEmpty());
		System.out.println(d.deal());
		System.out.println(d.size());
		d.shuffle();
		System.out.println(d);
		
		Deck d2 = new Deck(ranks, suits, values);
		System.out.println(d2.isEmpty());
		System.out.println(d2.deal());
		System.out.println(d2.size());
		d2.shuffle();
		System.out.println(d2);
		
		Deck d3 = new Deck(ranks, suits, values);
		System.out.println(d3.isEmpty());
		System.out.println(d3.deal());
		System.out.println(d3.size());
		d3.shuffle();
		System.out.println(d3);
	}
	

}
