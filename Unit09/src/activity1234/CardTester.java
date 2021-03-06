package activity1234;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("2", "clubs", 2);
		System.out.println(card1);
		System.out.println("suit: " + card1.suit());
		System.out.println("rank: " + card1.rank());
		System.out.println("pointValue: " + card1.pointValue() + "\n");
		
		
		Card card2 = new Card("ace", "spades", 1);
		System.out.println(card2);
		System.out.println("suit: " + card2.suit());
		System.out.println("rank: " + card2.rank());
		System.out.println("pointValue: " + card2.pointValue()+"\n");
		
		Card card3 = new Card("queen", "hearts", 12);
		System.out.println(card3);
		System.out.println("suit: " + card3.suit());
		System.out.println("rank: " + card3.rank());
		System.out.println("pointValue: " + card3.pointValue()+"\n");
		
		System.out.println("card2 matches card1: " + card2.matches(card1));
		System.out.println("card2 matches card3: " + card2.matches(card3));
		System.out.println("card1 matches card3: " + card1.matches(card3));
	}
}
