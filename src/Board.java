public class Board {

    private char[][] board = new char[3][3];

    public void initBoard() {
        //loop through rows
        for (int i = 0; i < 3; i++) {

            //loop through columns
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
