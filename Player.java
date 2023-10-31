/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private int points = 0;
  private boolean isTurn;
  private String name;
  /* your code here - constructor(s) */ 
  public Player(){
    System.out.println("Please enter your name:");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    points = 0;
    System.out.println("Welcome to the game " + name + "!");
  }
  public Player(String inputName){
    name = inputName;
    points = 0;
    System.out.println("Welcome to the game " + name + "!");
  }
  
  /* your code here - accessor(s) */ 
  public int getPoints() {
    return points;
  }

  public String getName() {
    return name;
  }
  
  /* your code here - mutator(s) */ 
  public void setPoints(int points) {
    /* incomplete */
  }

  public void setName(String name) {
    /* incomplete */
  }
}
