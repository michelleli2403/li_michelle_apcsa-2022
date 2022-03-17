public class Test {
	public TokenPass(int playerCount) {
		board = new int[playerCount];
		for (int i=0; i<board.length; i++) {
			board[i]=((int)Math.random()*10+1);
		}
		currentPlayer = ((int) Math.random() * playerCount);
	}
	
	public void distributeCurrentPlayerTokens() {
		int i=currentPlayer;
		while (board[currentPlayer]!=0) {
			if (i==board.length-1) {
				i=0;
				board[i]+=1;
			}
			else {
				board[i+1]+=1;
			}
			board[currentPlayer]--;
			i++;
		}
		
	}
	
}