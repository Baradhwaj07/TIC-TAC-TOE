# Console Tic-Tac-Toe Game

A console-based Tic-Tac-Toe game where a human plays against the computer. This project is designed to strengthen logical thinking, control flow, and modular programming.

## Project Structure

- `TicTacToe.java`: The main Java class containing the game logic.

## Current Progress

### UC1: Display Empty Tic-Tac-Toe Board
- **Goal**: Initialize a 3x3 board and display it on the console.
- **Concepts**: 2D Arrays, Nested Loops, Console Formatting.

### UC2: Toss to Decide First Player and Symbol
- **Goal**: Randomly decide who starts and assign symbols (X/O).
- **Concepts**: Random Number Generation, Conditional Logic, Game State.

### UC3: Accept User Slot Input
- **Goal**: Allow the user to enter a slot number (1-9).
- **Concepts**: User Input Handling, Scanner, Method Creation.

### UC4: Slot to Board Index Conversion
- **Goal**: Convert slot (1–9) to valid row and column indices.
- **Concepts**: Zero-based Indexing, Division and Modulo.

### UC5: Validate User Move
- **Goal**: Ensure the move is within bounds and the cell is empty.
- **Concepts**: Conditional Logic, Boundary Checking, Defensive Programming.

## How to Run

1. **Compile**:
   ```powershell
   javac TicTacToe.java
   ```
2. **Run**:
   ```powershell
   java TicTacToe
   ```

## Expected Output
```text
-----------------
|  -  |  -  |  -  |  
-----------------
|  -  |  -  |  -  |  
-----------------
|  -  |  -  |  -  |  
-----------------
```
