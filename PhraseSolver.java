/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  Player player1;
  Player player2;
  Board board;
  /* your code here - constructor(s) */ 
  //Implements requirements for PLTW 2.5.2
  public PhraseSolver(){
    System.out.println("Player 1");
    player1 = new Player();
    System.out.println("Player 2");
    player2 = new Player();
    board = new Board();
    boolean solved = false;
  }
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */
  //Implements requirements for PLTW 2.5.5
  public void play() {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    String guess;
   

    while (!solved) {

      /* your code here - game logic */
      System.out.println(board.getSolvedPhrase());
      //Changes name in message based on current player
      if (currentPlayer == 1) {
        System.out.println(player1.getName() + ", guess a letter to fill in the blanks or type the entire phrase to win!");
      } else {
        System.out.println(player2.getName() + ", guess a letter to fill in the blanks or type the entire phrase to win!");
      }

      guess = input.nextLine();
      //If the player guesses wrong
      if (!(board.guessLetter(guess) || board.isSolved(guess))) {
        //Swithches players from either 1 or 2
        System.out.println("Wrong!");
        if (currentPlayer == 1) {
          currentPlayer = 2;
        } else {
          currentPlayer = 1;
        }
      }
  

      /* your code here - determine how game ends */
      //If the solved phrase equals the current phrase or the player guess equals the entire phrase, game ends.
      if (board.isSolved(guess)) {
        solved = true;
      } 

    }
    System.out.println("Player " + currentPlayer + " wins!");
  } 
} 
