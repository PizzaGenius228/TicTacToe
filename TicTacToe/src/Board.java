public class Board {

    private final char board[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void print() {
        clearScreen();
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println(" - + - + - ");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println(" - + - + - ");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    public boolean update(int pos, char symbol) {
        if (board[pos] != 'x' && board[pos] != 'o') {
            board[pos] = symbol;
            return true;
        }
        return false;
    }

    public boolean checkWinner(char player) {
        return (board[1] == player && board[2] == player && board[3] == player) ||
                (board[4] == player && board[5] == player && board[6] == player) ||
                (board[7] == player && board[8] == player && board[9] == player) ||
                (board[1] == player && board[4] == player && board[7] == player) ||
                (board[2] == player && board[5] == player && board[8] == player) ||
                (board[3] == player && board[6] == player && board[9] == player) ||
                (board[1] == player && board[5] == player && board[9] == player) ||
                (board[3] == player && board[5] == player && board[7] == player);
    }
}
