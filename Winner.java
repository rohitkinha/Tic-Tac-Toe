class Winner extends TicTacToeBoard {

    //In this function we will be checking if any of the player is winning or not
    public boolean whoIsTheWinner(char[][] board) {
        // First checking row-wise
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][1] != '-') {
                return true;
            }
        }
        // Now checking Column-wise
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
                return true;
            }
        }
        // Checking diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            return true;
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
            return true;
        }
        return false;
    }

    //to check if all turn has been made but noone wins i.e, the game is a draw
    public boolean noonewins(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}