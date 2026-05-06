# UC1: Display Empty Tic-Tac-Toe Board

## Goal
The purpose of this use case is to display an empty 3×3 Tic-Tac-Toe board on the console so that the user can visually see the game layout before starting.

## Actor
**User** – the person who runs the program.

## Flow of Execution
1. The user runs the program.
2. The program creates and initializes the board.
3. The program prints the board on the console in a readable format.

## Theoretical Concepts Used

### 1. 2D Array (Board Representation)
A **2D Array** is used to represent the Tic-Tac-Toe board. It can be thought of as a table with rows and columns.
- Example structure: `board[3][3]`

### 2. Initialization Logic
Before displaying the board, all positions must be empty. Each cell is initialized with a placeholder symbol like `'-'`. This indicates that the cell is not yet occupied.

### 3. Nested Loops
Since it’s a 2D structure, we use **nested loops**:
- **Outer loop** → handles rows
- **Inner loop** → handles columns

This helps in both initializing and printing each cell.

### 4. Console Output Formatting
The board should be printed in a clean and readable format with proper spacing and separators to improve user understanding.

## Key Requirements
- Create a 3x3 character array.
- Initialize all cells with `-`.
- Print the board clearly with separators.
