package tutorialPag;

public class TicTacToe {

	public static void main(String[] args) {
		String[] grid = new String[3]; // Single dimension array
		grid[0] = " - ";
		grid[1] = " - ";
		grid[2] = " - ";
		
		String[][] board = new String[3][3]; // Create 2D array 3 rows 3
		board[0][0] = " - ";
		board[0][1]	= " - ";//fill middle index
		board[0][2] = " - ";
		
		
		for(int i = 0; i < grid.length; i++) { // Prints out rows only
			System.out.println(grid[i]);
		}
		
		// Fill and print 2D array
		System.out.println("fill and print 2d array");
		for(int row = 0; row < board.length; row++) { // Prints down (rows)
			
			//Prints each column
			for(int col = 0; col < board[row].length; col++) {
				board[row][col] = "-";
				System.out.print( board[row][col] );
			}
			System.out.println(); // Prints a new line after the row is done
		}//end for loop to print rows
		
		board[1][1] = "X";
		for(int row = 0; row < board.length; row++) { // prints down (rows)
			
			for(int col = 0; col < board[row].length; col++) {
				// board[row][col] = "-"; // fills in the board with dashes
				System.out.print( board[row][col] );
			}
			System.out.println(); // Prints a new line after the row is done
		}//end for loop to print rows
		
int player = 1;
//take input player
//place the token
//switch players
player =2;

	}//end main

}
