public class Board {

    private char[] board;

    public void initBoard() {
        board = new char[9];

        //loop through array and add '-'
        for (int i = 0; i < 9; i++) {
            board[i] = '-';
        }
    }

    public void printBoard() {
        System.out.print("-----------------");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            System.out.print("| ");
            System.out.print(board[i] + " | ");
        }
        System.out.println();
        System.out.println("-----------------");
    }
}
