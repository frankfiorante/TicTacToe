public class TicTacToe {

    private char player;

    public static void main (String[] args) {
        System.out.println("Tic Tac Toe!");
        Board game = new Board();
        game.initBoard();
        game.printBoard();
    }


}
