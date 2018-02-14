import java.util.Scanner;

public class TicTacToe {

    private static char player = 'X';

    private static void changePlayer() {
        if (player == 'X') {
            player = 'O';
        }
        else {
            player = 'X';
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Board game = new Board();
        game.printBoard();

        while (!game.end() && !game.win()) {
            if (player == 'X')
                System.out.println("Player 1 please enter your move!");
            else
                System.out.println("Player 2 please enter your move!");

            String move = sc.nextLine();
            int movedSpot = game.getIndex(move);

            while (movedSpot < 0 || !game.validateMove(movedSpot)) {
                System.out.println("Sorry but that was an invalid move" + " please enter a valid move!");
                move = sc.nextLine();
                movedSpot = game.getIndex(move);

            }
            game.place(movedSpot, player);
            game.printBoard();
            changePlayer();
        }
    }
}
