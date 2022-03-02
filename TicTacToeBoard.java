class TicTacToeBoard {
    char[][] board = new char[3][3];// Intialising the 3x3 Matrix to create the board
    int row = 0;// for taking input from user
    int col = 0;// for taking input from user
    boolean player1 = true;// To Alter between turns
    boolean theEnd = false;// To check when the game ends
    int count = 0;// To count the number of turns played so that the computer can make a smart move according to the count number
        

    // Initialising every position with a '-''
    public void createboard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // For printing the board at any stage of the game
    public void printboard(char[][] board) {
        System.out.println("Here is the board : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    // function to make computer's turn
    public void computerturn(char[][] board, int count) {
        while (true) {
            char c = 'O';// Changing the value so that O is filled in the board
            if (count == 1) {// if its just the 1st turn of the computer it has to be a random one
                row = (int) ((10 * Math.random()) % 3);// randomly assigning value to row
                col = (int) ((10 * Math.random()) % 3);// randomly assigning value to row
                if (board[row][col] == '-') {
                    board[row][col] = c;
                    break;
                }
            } else {// else if its not the first turn of the computer then we will make the move
                    // intelligently
                // What we will be doing is that we first check if the computer can win somehow
                // else if it can't then we will try to defend the game from player winning it
                // Checking if the computer is winning or not
                // Horizontally
                for (int i = 0; i < 3; i++) {
                    if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == '-') {
                        board[i][2] = c;
                        return;
                    } else if (board[i][0] == 'O' && board[i][1] == '-' && board[i][2] == 'O') {
                        board[i][1] = c;
                        return;
                    } else if (board[i][0] == '-' && board[i][1] == 'O' && board[i][2] == 'O') {
                        board[i][0] = c;
                        return;
                    }
                }
                // Vertically
                for (int i = 0; i < 3; i++) {
                    if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == '-') {
                        board[2][i] = c;
                        return;
                    } else if (board[0][i] == 'O' && board[1][i] == '-' && board[2][i] == 'O') {
                        board[1][i] = c;
                        return;
                    } else if (board[0][i] == '-' && board[1][i] == 'O' && board[2][i] == 'O') {
                        board[0][i] = c;
                        return;
                    }
                }
                // Diagonally
                if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == '-') {
                    board[2][2] = c;
                    return;
                } else if (board[0][0] == 'O' && board[1][1] == '-' && board[2][2] == 'O') {
                    board[1][1] = c;
                    return;
                } else if (board[0][0] == '-' && board[1][1] == 'O' && board[2][2] == 'O') {
                    board[0][0] = c;
                    return;
                } else if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == '-') {
                    board[0][2] = c;
                    return;
                } else if (board[2][0] == 'O' && board[1][1] == '-' && board[0][2] == 'O') {
                    board[1][1] = c;
                    return;
                } else if (board[2][0] == '-' && board[1][1] == 'O' && board[0][2] == 'O') {
                    board[2][0] = c;
                    return;
                }
                // defending the match
                // Horizontally
                for (int i = 0; i < 3; i++) {
                    if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == '-') {
                        board[i][2] = c;
                        return;
                    } else if (board[i][0] == 'X' && board[i][1] == '-' && board[i][2] == 'X') {
                        board[i][1] = c;
                        return;
                    } else if (board[i][0] == '-' && board[i][1] == 'X' && board[i][2] == 'X') {
                        board[i][0] = c;
                        return;
                    }
                }
                // Vertically
                for (int i = 0; i < 3; i++) {
                    if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == '-') {
                        board[2][i] = c;
                        return;
                    } else if (board[0][i] == 'X' && board[1][i] == '-' && board[2][i] == 'X') {
                        board[1][i] = c;
                        return;
                    } else if (board[0][i] == '-' && board[1][i] == 'X' && board[2][i] == 'X') {
                        board[0][i] = c;
                        return;
                    }
                }
                // Diagonally
                if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == '-') {
                    board[2][2] = c;
                    return;
                } else if (board[0][0] == 'X' && board[1][1] == '-' && board[2][2] == 'X') {
                    board[1][1] = c;
                    return;
                } else if (board[0][0] == '-' && board[1][1] == 'X' && board[2][2] == 'X') {
                    board[0][0] = c;
                    return;
                } else if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == '-') {
                    board[0][2] = c;
                    return;
                } else if (board[2][0] == 'X' && board[1][1] == '-' && board[0][2] == 'X') {
                    board[1][1] = c;
                    return;
                } else if (board[2][0] == '-' && board[1][1] == 'X' && board[0][2] == 'X') {
                    board[2][0] = c;
                    return;
                }

                // here if there is no such situation happening where the computer is winning or
                // defending in the next move then we make move randomly
                row = (int) ((10 * Math.random()) % 3);
                col = (int) ((10 * Math.random()) % 3);
                if (board[row][col] == '-') {
                    board[row][col] = c;
                    return;
                }

            }
        }
    }
}
