# Tic Tac Toe - Java Swing Application

This is a simple **Tic Tac Toe** game implemented in Java using the Swing library. The game provides a graphical interface where two players can take turns playing on a 3x3 grid. The first player to align three marks horizontally, vertically, or diagonally wins the game. If all cells are filled without a winner, the game ends in a draw.

## Features

- Two-player gameplay (Player 1: X, Player 2: O).
- Simple and intuitive graphical interface using `JFrame` and `JPanel`.
- Automatic detection of winners and reset for a new game.
- Draw detection with an option to restart the game.

## Requirements

- Java Development Kit (JDK) 8 or higher.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans) or any text editor for running the code.

## How to Run

1. Clone or download the repository.
2. Open the project in your preferred IDE.
3. Compile and run the `app.java` file.

## Code Structure

### Main Components

- **JFrame Setup**: The game window is created using `JFrame` and configured with a 3x3 grid layout.
- **Game Logic**: 
  - **Player Moves**: Players alternate between "X" and "O".
  - **Win Detection**: Checks rows, columns, and diagonals for three identical marks.
  - **Draw Detection**: Determines if the game ends with no winner when all cells are filled.
- **Reset Functionality**: Resets the board for a new game after a win or draw.

### Key Methods

1. **`test()`**: Verifies if a player has won the game by checking rows, columns, and diagonals.
2. **`reset()`**: Resets the game state and clears the board.
3. **`draw()`**: Checks if all cells are filled and declares the game a draw if no winner is found.

## Screenshots

(Take a screenshot of the game in action and include it here.)

## How to Contribute

If you’d like to contribute to this project:
1. Fork the repository.
2. Make your changes or enhancements.
3. Submit a pull request for review.

## Future Improvements

- Add a single-player mode with AI.
- Implement a scoring system.
- Enhance the UI/UX with better graphics and animations.

## Author

This project was created by Mohamed-yassine KOUBI.
