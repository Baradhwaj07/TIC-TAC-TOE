import java.util.Random;
import java.util.Scanner;

/**
 * TicTacToe
 * UC6 places a player's symbol on the board at the given position.
 * This use case focuses on updating game state.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program. Places a sample move
     * and prints the updated cell value.
     */
    public static void main(String[] args) {
        placeMove(0, 0, 'X');
        System.out.println(board[0][0]);
    }

    /**
     * Updates the board by placing the given symbol at
     * the specified row and column.
     * Input: Row, Column, Symbol
     * Hint: Assume the move is already validated.
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3) && (col >= 0 && col < 3) && (board[row][col] == '-');
    }

    /**
     * Converts slot number into row index using zero-based indexing.
     * Input: Slot number (1-9)
     * Output: Row index (0-2)
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /**
     * Converts slot number into column index using modulo operation.
     * Input: Slot number (1-9)
     * Output: Column index (0-2)
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    /**
     * Reads an integer slot value from the user.
     * Output: Slot number (1-9)
     */
    static int getUsersSlot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter slot number (1-9): ");
        return scanner.nextInt();
    }

    /**
     * Initializes the 3x3 board by filling each cell with '-' to indicate
     * an empty position.
     */
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    /**
     * Prints the Tic-Tac-Toe board using horizontal and vertical separators.
     */
    static void printBoard() {
        System.out.println("-----------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("|  ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + "  |  ");
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    /**
     * Uses random logic to decide the first player and assigns symbols
     * based on the toss outcome. This method initializes the game state.
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2); // 0 for Human, 1 for Computer

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * Displays the toss result, indicating who plays first and which
     * symbol is assigned to each player.
     */
    static void displayTossResult() {
        System.out.println("Toss result:");
        if (isHumanTurn) {
            System.out.println("Human won the toss and starts first.");
        } else {
            System.out.println("Computer won the toss and starts first.");
        }
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}
