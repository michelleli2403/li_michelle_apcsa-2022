package activity9;

import java.util.List;

import activity1234.Card;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class TensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 13;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public TensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) { //selectedCards is a reference to the list of cards
	/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		if (selectedCards.size()==2) {
			return containsPairSum10(selectedCards);
		} else if (selectedCards.size()==4) {
			return contains4(selectedCards);
		} else {
			return false;
		}
			
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		List<Integer> cIndexes = cardIndexes();
		return containsPairSum10(cIndexes) || contains4(cIndexes);
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum10(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		for (int sk1 = 0; sk1 < selectedCards.size(); sk1++) {
			int k1=selectedCards.get(sk1).intValue();
			for (int sk2=sk1+1; sk2<selectedCards.size(); sk2++) {
				int k2=selectedCards.get(sk2).intValue();
				if (cardAt(k1).pointValue()+cardAt(k2).pointValue()==10) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean contains4(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		//boolean same = false;
		
		/*Card first = cardAt(selectedCards.get(0));
		Card second = cardAt(selectedCards.get(1));
		Card third = cardAt(selectedCards.get(2));
		Card fourth = cardAt(selectedCards.get(3));
		if (first.rank().equals(second.rank()) && second.rank().equals(third.rank()) && third.rank().equals(fourth.rank())) {
			if (first.rank().equals("king") || first.rank().equals("queen") || first.rank().equals("jack") || first.rank().equals("10"))
				same=true;
		}*/
		int kingCount=0;
		int queenCount=0;
		int jackCount=0;
		int tenCount=0;
		for (int i=0; i<selectedCards.size(); i++) {
			String s = cardAt(selectedCards.get(i)).rank();
			if (s.equals("king")) {
				kingCount++;
			}
			else if (s.equals("queen")) {
				queenCount++;
			}
			else if (s.equals("jack")) {
				jackCount++;
			}
			else if (s.equals("10")) {
				tenCount++;
			}
		}
		
		return kingCount==4 || queenCount==4 || jackCount==4 || tenCount==4;
	}
}
