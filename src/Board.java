import java.util.Arrays;

public class Board {

    private char[] board = new char[9];
    private final String[] translate = {"1A", "1B", "1C",
                                        "2A", "2B", "2C",
                                        "3A", "3B", "3C"};
    private int trips[][] = {
            {0,1,2}, {3,4,5}, {6,7,8},
            {0,3,6}, {1,4,7}, {2,5,8},
            {0,4,8}, {2,4,6}};

    public Board() {
        clearBoard();
    }

    public boolean win() {
        for (int[] x : trips) {
            //System.out.println(Arrays.toString(x));
            if (board[x[0]] == board[x[1]] && board[x[0]] == board[x[2]] && board[x[0]] != '-') return true;
        }
        return false;
    }

    public boolean validateMove (int x) {
        return (board[x] == '-');
    }

    public boolean end() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == '-') {
                return false;
            }
        }
        return true;
    }

    public int getIndex(String x) {
        x = x.toUpperCase();
        for (int i = 0; i < translate.length; i++) {
            if (x.equals(translate[i])) return i;
        }
        return -1;
    }

    public void place(int x, char player){
        if (board[x] == '-' && board[x] != 'X' && board[x] != 'O') {
            board[x] = player;
        }
    }

    public void clearBoard() {
        //loop through array and add '-'
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
    }

    public void printBoard() {
        System.out.println("    A     B     C");
        System.out.print("  -----------------");
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0) {
                System.out.println();
                int row = (i / 3) + 1;
                System.out.print(row + " ");
            }
            System.out.print("| ");
            System.out.print(board[i] + " | ");
        }
        System.out.println();
        System.out.println("  -----------------");
    }
}
