import java.util.Scanner;

public class TicTacToe {
    public static void main(String args[]) {
        while (true) {
            // Firstly welcoming and introducing user to the game
            System.out.println();
            System.out.println();
            System.out.println(
                    "******************************************     Welcome to Tic Tac Toe    ********************************************");
            System.out.println();
            System.out.println();
            System.out.println("Here are the instructions to play the game");
            System.out.println();
            System.out.println("If you don't to play anymore and want to exit from the game. Press -1");
            System.out.println("Else there are two modes for you to play : ");
            System.out.println();
            System.out.println("Press 1 if you to wish play a Player vs Player game");
            System.out.println("Press 2 if you wish to play a Player vs Computer game");
            System.out.println();
            System.out.println();
            Scanner sc = new Scanner(System.in);
            int gametype = sc.nextInt();// To ask which type of game user wants to play or to exit from the game
            if (gametype == -1) {
                break;
            } else {
                // Player vs Player game Starts
                if (gametype == 1) {
                    System.out.println(
                            "********************************    You selected for a Player Vs Player Game   *****************************");
                    System.out.println();
                    // Creating board(object) for a player vs player game
                    TicTacToeBoard PvsPgame = new TicTacToeBoard();
                    PvsPgame.createboard();// Creating the board for game
                    Winner resultofthegame = new Winner();// Creating object from winner class to check if we get a
                                                          // winner or the game is a draw
                    while (!PvsPgame.theEnd) {// Untill the game ends this loop will be executed

                        PvsPgame.printboard(PvsPgame.board);// printing board in every turn
                        if (PvsPgame.player1 == true) {
                            System.out.println("It is Player1's (X) turn : ");
                            System.out.println();
                        } else {
                            System.out.println("It is Player2's (O) turn : ");
                            System.out.println();
                        }
                        char c = '-';// For switching the Between X and O according to the player's turn
                        if (PvsPgame.player1) {
                            c = 'X';
                        } else {
                            c = 'O';
                        }
                        while (true) {
                            // Taking Valid inputs
                            System.out.println("Enter X,Y co-ordinates of your move : ");
                            System.out.println("The co-ordinates range from {1,2,3} in both directions : ");
                            System.out.println();
                            PvsPgame.row = sc.nextInt();
                            PvsPgame.col = sc.nextInt();
                            if (PvsPgame.row < 1 || PvsPgame.col < 1 || PvsPgame.row > 3 || PvsPgame.col > 3) {
                                System.out.println("Your entry is invalid and is off the bounds of board ! ");
                                System.out.println();
                                System.out.println("Enter a valid input : ");
                                System.out.println();
                            } else if (PvsPgame.board[PvsPgame.row - 1][PvsPgame.col - 1] != '-') {
                                System.out.println("Oops!!! This place is already occupied.");
                                System.err.println();
                                System.out.println("Enter another value : ");
                                System.out.println();
                            } else {
                                // If everything is rigth then the input is valid
                                break;
                            }
                        }
                        // updating the board
                        PvsPgame.board[PvsPgame.row - 1][PvsPgame.col - 1] = c;
                        // Checking if we get a winner or not
                        if (resultofthegame.whoIsTheWinner(PvsPgame.board)) {
                            if (c == 'X') {
                                System.out.println("Hurray !!!");
                                System.out.println(
                                        "-----------------------  Player1 is the winner!!!  -------------------------");
                            } else {
                                System.out.println("Bravo !!!");
                                System.out.println(
                                        "----------------------   Player2 is the winner!!!  ------------------------------");
                            }
                            PvsPgame.theEnd = true;
                        } else {
                            // Checking if the game is draw or not
                            if (resultofthegame.noonewins(PvsPgame.board)) {
                                System.out.println(
                                        "Unfortunately !!! ----------------------   The Game Ended In A Tie!!!  ---------------------");
                                System.out.println("Wanna Try another match !!!");
                                System.out.println();
                                PvsPgame.theEnd = true;// making the bool the end variable true so that the game
                                                       // ends
                            } else {
                                // Altering the players
                                PvsPgame.player1 = !PvsPgame.player1;
                            }
                        }
                    }
                    PvsPgame.printboard(PvsPgame.board);// Printing the board again

                } else {
                    // Player vs Computer game starts
                    System.out.println(
                            "******************************      You have entered a Player vs Computer game      *****************************");
                    System.out.println();
                    System.out.println("Player(Player1) is X and Computer(Player2) is O");
                    TicTacToeBoard PvsCgame = new TicTacToeBoard();// Making a board object for this player vs
                                                                   // Computer game
                    PvsCgame.createboard();// Creating board
                    Winner resultofgame = new Winner();// Creaking a winner object
                    while (!PvsCgame.theEnd) {// Loop till the game ends
                        PvsCgame.printboard(PvsCgame.board);// Printing board each time the loop executes
                        char c = '-';

                        if (PvsCgame.player1 == true) {// Checking if it is player's turn or Computer's
                            c = 'X';
                            System.out.println();
                            System.out.println("It is Player's (X) turn : ");
                            while (true) {
                                // Taking valid inputs
                                System.out.println("Enter X,Y co-ordinates of your move : ");
                                System.out.println("The co-ordinates range from {1,2,3} in both directions : ");
                                System.out.println();
                                PvsCgame.row = sc.nextInt();
                                PvsCgame.col = sc.nextInt();
                                if (PvsCgame.row < 1 || PvsCgame.col < 1 || PvsCgame.row > 3 || PvsCgame.col > 3) {
                                    System.out.println("Your entry is invalid and is off the bounds of board ! ");
                                    System.out.println("Enter a valid input : ");
                                } else if (PvsCgame.board[PvsCgame.row - 1][PvsCgame.col - 1] != '-') {
                                    System.out.println("This place is already occupied!");
                                    System.out.println("Enter another value : ");
                                } else {
                                    // Input is valid
                                    break;
                                }
                            }
                            // Updating the board
                            PvsCgame.board[PvsCgame.row - 1][PvsCgame.col - 1] = c;
                            PvsCgame.count++;// Incrementing the count which would be helpful in making computer's
                                             // turn
                            if (resultofgame.whoIsTheWinner(PvsCgame.board)) {// Cheking if we got a winner or not
                                if (c == 'X') {
                                    System.out.println("Hurray !!!");
                                    System.out.println(
                                            "-----------------------  Player is the winner!!!  -------------------------");
                                } else {
                                    System.out.println("Bravo !!!");
                                    System.out.println(
                                            "----------------------   Computer is the winner!!!  ------------------------------");
                                }
                                PvsCgame.theEnd = true;// Ending the game
                            } else {
                                if (resultofgame.noonewins(PvsCgame.board)) {// Checking if game is draw or not
                                    System.out.println(
                                            "Unfortunately !!! ----------------------   The Game Ended In A Tie!!!  ---------------------");
                                    System.out.println("Wanna Try another match !!!");
                                    System.out.println();
                                    PvsCgame.theEnd = true;// ending the game
                                }
                            }
                            PvsCgame.player1 = false;// making it false so that it doesn't loop again

                        } else {
                            PvsCgame.computerturn(PvsCgame.board, PvsCgame.count);// Making Computer's Turn after
                                                                                  // the player's turn
                            if (resultofgame.whoIsTheWinner(PvsCgame.board)) {// Checking is we get a winner or not
                                if (c == 'X') {
                                    System.out.println("Hurray !!!");
                                    System.out.println(
                                            "-----------------------  Player is the winner!!!  -------------------------");
                                } else {
                                    System.out.println("Bravo !!!");
                                    System.out.println(
                                            "----------------------   Computer is the winner!!!  ------------------------------");
                                }
                                PvsCgame.theEnd = true;// Ending the game
                            } else {
                                if (resultofgame.noonewins(PvsCgame.board)) {// Checking if the game is draw or not
                                    System.out.println(
                                            "Unfortunately !!! ----------------------   The Game Ended In A Tie!!!  ---------------------");
                                    System.out.println("Wanna Try another match !!!");
                                    System.out.println();
                                    PvsCgame.theEnd = true;
                                }
                            }
                            PvsCgame.player1 = true;// Making it true so that we can take the player's next input
                        }
                    }
                    PvsCgame.printboard(PvsCgame.board);// Finally printing the board
                }
            }
        }
    }
}