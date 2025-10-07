# 🎮 Tic Tac Toe (Java Console Game)

A simple two-player **Tic Tac Toe** game built in **Java**, playable in the console.  
Players take turns placing X or O on a 3×3 board until one wins or the game ends in a draw.

---

## 🧩 Features
- Two-player mode (X vs O)
- Validates moves (no overwriting or invalid inputs)
- Detects wins and draws
- Clean modular code using 3 classes: `Main`, `Game`, and `Board`

---

## 🏗️ Project Structure
```
TicTacToe/
├── src/
│   ├── Main.java
│   ├── Game.java
│   └── Board.java
├── TicTacToe.iml
├── package.json
├── package-lock.json
└── README.md
```

---

## ▶️ How to Run

### Using IntelliJ IDEA
1. Open the project in IntelliJ or VsCode.
2. Open `src/Main.java`.
3. Press **Run ▶️** or **Shift + F10**.

### Using Command Line
```bash
javac src/*.java
java -cp src Main
```

```

## 🧠 Example Gameplay
```
Welcome to Tic Tac Toe!
```
 1 | 2 | 3
---+---+---
 4 | 5 | 6
---+---+---
 7 | 8 | 9
```
It's X's turn!
Choose a position (1-9): 3
```
 1 | 2 | x
---+---+---
 4 | 5 | 6
---+---+---
 7 | 8 | 9
```
It's O's turn!
Choose a position (1-9): 5
```
 1 | 2 | x
---+---+---
 4 | o | 6
---+---+---
 7 | 8 | 9
```
It's X's turn!
Choose a position (1-9): 9
```
 1 | 2 | x
---+---+---
 4 | o | 6
---+---+---
 7 | 8 | x
```
It's O's turn!
Choose a position (1-9): 4
```
 1 | 2 | x
---+---+---
 o | o | 6
---+---+---
 7 | 8 | x
```
It's X's turn!
Choose a position (1-9): 6
```
 1 | 2 | x
---+---+---
 o | o | x
---+---+---
 7 | 8 | x
Player X WINS!
```

