import java.util.Random;

/**
 * TicTacToe
 * UC2 performs a random toss to decide who plays first and assigns
 * symbols (X or O) to the human and computer accordingly.
 */
public class TicTacToe {

    static char[][] board = new char[3][3];
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program. Executes the toss logic and displays
     * the result of turn and symbol assignment.
     */
    public static void main(String[] args) {
        initializeBoard(); // Keeping UC1 logic
        tossAndAssignSymbols();
        displayTossResult();
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
