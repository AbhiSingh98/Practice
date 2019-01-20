package ttt;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author abhisingh
 */
public class TTT {

    Scanner in = new Scanner(System.in);
    static char[][] board = new char[3][3];
    private boolean xTurn;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printBoard();
        System.out.println();
        System.out.println("Enter row and col ");

    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print("\n");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);

            }
        }
    }

    
            

    public static void restart() {

        //empty the game board
        for (int r = 0; r < 3; r++) {

            for (int c = 0; c < 3; c++) {
                board[r][c] = ' ';
            }
        }

        //reset whose turn it is
        xTurn = true;
    }
    
    
}
