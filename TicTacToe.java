import java.util.Random;
import java.util.Scanner;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move
 * by reusing slot conversion and validation logic.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol = 'O';

    /**
     * Entry point of the program. Triggers the computer move.
     */
    public static void main(String[] args) {
        computerMove();
        printBoard();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random random = new Random();
        int row, col;
        do {
            int slot = random.nextInt(9) + 1; // 1-9
            row = getRowFromSlot(slot);
            col = getColFromSlot(slot);
        } while (!isValidMove(row, col));

        System.out.println("Computer chose slot: " + (row * 3 + col + 1));
        placeMove(row, col, computerSymbol);
    }

    /**
     * Updates the board by placing the given symbol at
     * the specified row and column.
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
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
