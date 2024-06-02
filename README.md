# Sudoku Solver in Java

## Introduction

This project implements a Sudoku solver using a backtracking recursive approach in Java. The program reads a Sudoku puzzle, solves it using the backtracking algorithm, and outputs the solution.

## Features

- Reads a 9x9 Sudoku puzzle from a predefined 2D array.
- Utilizes the backtracking algorithm to solve the puzzle.
- Outputs the solved Sudoku puzzle.
- Handles invalid or unsolvable puzzles gracefully.

## Algorithm

### Backtracking Approach

The backtracking algorithm is a depth-first search approach that incrementally builds candidates for the solution and abandons a candidate ("backtracks") as soon as it determines that the candidate cannot possibly be completed to a valid solution.

1. **Find an empty cell.**
2. **Try all numbers from 1 to 9:**
   - If the number is safe (i.e., not already present in the current row, column, or 3x3 subgrid), place it in the cell.
   - Recursively attempt to fill the rest of the board.
   - If placing the current number leads to a solution, return true.
   - If not, reset the cell (backtrack) and try the next number.
3. **If all cells are filled correctly, the puzzle is solved.**

## Installation

To run the Sudoku solver, you need to have Java installed on your machine. Follow these steps to set up and run the project:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/sudoku-solver-java.git
   cd sudoku-solver-java
   ```

2. **Compile the Java code:**
   ```bash
   javac SudokuSolver.java
   ```

3. **Run the solver:**
   ```bash
   java SudokuSolver
   ```

## Usage

1. **Input:**
   - The Sudoku puzzle is defined in a 2D array within the `SudokuSolver.java` file.
   - Empty cells are represented by the character '.'.

2. **Output:**
   - The solved Sudoku puzzle is printed to the console.
   - If the puzzle is unsolvable, a message indicating so is displayed.

## Example

### Input
```java
char[][] board = {
    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
};
```

### Output
```
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
```

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue if you have any suggestions or improvements.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

For any questions or inquiries, please contact [eshwarsaaigouru456@gmail.com](mailto:your-email@example.com).

---

Feel free to customize the content according to your specific details and preferences!
