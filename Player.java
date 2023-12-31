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
    System.out.println("Welcome to the game " + name + "!\n");
  }
  public Player(String inputName){
    name = inputName;
    points = 0;
    System.out.println("Welcome to the game " + name + "!\n");
  }
  
  /* your code here - accessor(s) */ 
  //Implements requirements for PLTW 2.5.4
  public int getPoints() {
    return points;
  }

  //Implements requirements for PLTW 2.5.4
  public String getName() {
    return name;
  }
  
  /* your code here - mutator(s) */ 
  //Implements requirements for PLTW 2.5.5
  public void setPoints(int points) {
    this.points = points;
  }

  //Implements requirements for PLTW 2.5.5
  public void setName(String name) {
    this.name = name;
  }
}
