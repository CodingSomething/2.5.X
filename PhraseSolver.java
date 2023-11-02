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

  public void play() {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    String guess;
   

    while (!solved) {

      /* your code here - game logic */
      System.out.println(board.getSolvedPhrase());
      if (currentPlayer == 1) {
        System.out.println(player1.getName() + ", guess a word or phrase.");
        guess = input.nextLine();
        board.guessLetter(guess);
      } else {
        System.out.println(player2.getName() + ", guess a word or phrase.");
        guess = input.nextLine();
        board.guessLetter(guess);
      }
  

      /* your code here - determine how game ends */
      //If the solved phrase equals the current phrase or the player guess equals the entire phrase, game ends.
      if ((board.getSolvedPhrase().equals(board.getCurrentPhrase())) || (guess.equals(board.getCurrentPhrase()))) {
        solved = true;
      } else {
        //Swithches players from either 1 or 2
        if (currentPlayer == 1) {
          currentPlayer = 2;
        } else {
          currentPlayer = 1;
        }
      }
    }
  } 
} 
