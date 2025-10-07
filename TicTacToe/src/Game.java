import java.util.Scanner;

public class Game {
    private final Board board = new Board();
    private char currentPlayer = 'x';
    private final Scanner scanner = new Scanner(System.in);

    public void start(){
        int moves = 0;
        board.print();

        while(moves < 9){
            System.out.println("Player " + currentPlayer + ", choose position (1-9): ");
            int pos = scanner.nextInt();

            if(pos < 1 || pos > 9) {
                System.out.println("Invalid Position!");
                continue;
            }
            
            if(board.update(pos, currentPlayer)){
                moves++;
                board.print();

                if(board.checkWinner(currentPlayer)){
                    System.out.println("Player " + currentPlayer + " wins!");
                    return;
                }

                currentPlayer = (currentPlayer == 'x') ? 'o' : 'x';
            }
            else{
                System.out.println("Choose a valid spot!");
            }
        }
        System.out.println("It's a draw! GG BOYS");
    }
}
