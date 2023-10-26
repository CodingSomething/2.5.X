/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private boolean solved;
  private Board board;
  private Player player1;
  private Player player2;
  /* your code here - constructor(s) */ 
  public PhraseSolver(){

  }
  System.out.println("Please enter the name of the first player.");
  player1 = new Player(sc.NextLine());    
  System.out.println("Please enter the name of the second player.");
  player2 = new Player(sc.NextLine());
  board = new Board();
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
   

    while (!solved) 
    {

      }
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}
