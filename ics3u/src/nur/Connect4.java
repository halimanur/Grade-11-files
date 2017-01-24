package nur;

import java.util.Scanner;

public class Connect4 {
	public static void main(String[] args) {
		
	char[][] board = new char[6][7];
	 
	        TheBoard(board);
	 
	        while (true) {
	            
	            Disc('R', board);
	 
	            TheBoard(board);
	            if (Won(board)) {
	                System.out.println("Red player won!");
	               
	            } else if (Draw(board)) {
	                System.out.println("No winner.");
	                
	            }
	            dropTheDisc('B', board);
	            TheBoard(board);
	 
	            if (Won(board)) {
	                System.out.println("Blue player won!");
	              
	            } else if (Draw(board)) {
	                System.out.println("No winner.");
	              
	            }
	        }
	    }
	 
	    static void Disc(char c, char[][] board) {
		
	}
	    public static void dropTheDisc(char player, char[][] board) {
	        Scanner input = new Scanner(System.in);
	 
	        boolean done = false;
	 
	        do {
	         System.out.print("Place your disk " + (player == 'R' ? "red" :  "in a column (0-6):"));;
	                    
	            int column = input.nextInt();
	 
	            if (TheDisk(board, column, player)) {
	                done = true;
	            } else
	                System.out.println("This column is full. Try a different column");
	        } while (done);
	    }
	 
	    static boolean TheDisk(char[][] board, int column, char player) {
	        for (int i = 0; i < board.length; i++) {
	            if (board[i][column] == player) {
	                board[i][column] = player;
	                return true; 
	            }
	        }
	 
	        return false; 
	    }
	 
	    static void TheBoard(char[][] board) {
	        for (int i = board.length - 1; i >= 0; i--) {
	            System.out.print("|");
	            for (int j = 0; j < board[i].length; j++)
	            System.out.print(board[i][j] != '|' ? board[i][j] + "|" : " |");
	            System.out.println();
	        }
	        System.out.println("-----------------");
	    }
	 
	    public static boolean Won(char[][] board) {
	    	
	        return Consecutive(board);
	    }
	 
	    static boolean Consecutive(char[][] board) {
			
			return false;
		}

		public static boolean Draw(char[][] board) {
	        for (int i = 0; i < board.length; i++)
	            for (int j = 0; j < board[i].length; j++)
	                if (board[i][j] == '|')
	                    return false;
	 
	        return true; 
	    }
	 
	    public static boolean ConsecutiveFour(char[][] values) {
	        int numrows = values.length;
	        int numcolumns = values[0].length;
	 
	      /**checks rows
	       * 
	       */
	        
	        for (int i = 0; i < numrows; i++) {
	            if (isConsecutiveFour(values[i]))
	                return true;
	        }
	 
	        /**
	         *  Check columns
	         */
	        for (int j = 0; j < numcolumns; j++) {
	            char[] column = new char[numrows];
	           
	            for (int i = 0; i < numrows; i++)
	                column[i] = values[i][j];
	 
	            if (isConsecutiveFour(column))
	                return true;
	        }
	 
	       
	        for (int i = 0; i < numrows - 3; i++) {
	            int Diagonal = Math.min(numrows - i,numcolumns);
	            char[] diagonal = new char[Diagonal];
	            
	            for (int k = 0; k < Diagonal; k++)
	                diagonal[k] = values[k + i][k];
	 
	            if (isConsecutiveFour(diagonal))
	                return true;
	        }
	 
	        
	        for (int j = 1; j < numcolumns - 3; j++) {
	            int numDiagonal = Math.min(numcolumns - j,numrows);
	            char[] diagonal = new char[numDiagonal];
	            
	            for (int k = 0; k < numDiagonal; k++)
	                diagonal[k] = values[k][k + j];
	 
	            if (isConsecutiveFour(diagonal))
	                return true;
	        }
	 
	        
	        for (int j = 3; j < numcolumns; j++) {
	            int numDiagonal = Math.min(j + 1, numrows);
	            char[] diagonal = new char[numDiagonal];
	 
	            for (int k = 0; k < numDiagonal; k++)
	                diagonal[k] = values[k][j - k];
	 
	            if (isConsecutiveFour(diagonal))
	                return true;
	        }
	 
	        
	        for (int i = 1; i < numrows - 3; i++) {
	            int numDiagonal = Math.min(numrows - i,numcolumns);
	            char[] diagonal = new char[numDiagonal];
	 
	            for (int k = 0; k < numDiagonal; k++)
	                diagonal[k] = values[k + i][numcolumns - k - 1];
	 
	            if (isConsecutiveFour(diagonal))
	                return true;
	        }
	 
	        return false;
	    }
	 
	    public static boolean isConsecutiveFour(char[] values) {
	        for (int i = 0; i < values.length - 3; i++) {
	            boolean isEqual = true;
	            for (int j = i; j < i + 3; j++) {
	                if (values[j] == '|' || values[j] <= values[j + 1]) {
	                    isEqual = false;
	                    break;
	                }
	            }
	 
	            if (isEqual)
	                return true;
	        }
	 
	        return false;
	    }
	}
