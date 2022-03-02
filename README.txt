//Name – Rohit Kinha
//Entry Number – 2020csb1118

There are 7 files in this folder : TicTacToe.java, TicTacToe.class, TicTacToeBoard.java, TicTacToeBoard.class, Winner.java, Winner.class and README.txt
Please run the program only when TicTacToe.java,TicTacToeBoard.java and Board.java are present.

Instructions on how to use/run the program!

The Following Instructions Should Be Followed While Playing TIC TAC TOE (Running The Program) :
    A. Enter the command javac TicTaeToe.java in the terminal after that enter the command java TicTacToe to run the program.
    B. When it is asked by the program how you wish to play you should only enter an integer value.
    C. After that the program ask user to enter the co-ordinates of the move, as the game is implemented using a 3x3 matrix.
    D. Make sure that the co-ordinates you enter are either 1,2,3 in both the directions.
    E. Read the instructions appearing on the screen and input values according to it.
    F. The game ends when we get a winner or the game is draw , i.e, the game will continue until one player/computer has scored three in a row or all squares have been filled with no winner.
    G. After that the program asks user if he/she wants to play again or exit the game.
    H. The user then has to enter -1 if he want to exit from the game else chose 1 or 2 according to your wish.

    
The computer makes its turn using the following algorithm:
    A. First we check if computer can win, if it can then computer goes for that move.
    B. If above doesn't happen it goes for a move in which it can resist Player from winning if in next move Player can win.
    C. If no above condition occurs then it make a random move in an Unoccupied position.
