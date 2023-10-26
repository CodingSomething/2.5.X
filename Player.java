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
  public Player(String name){
    this.name = name;
  }
  /* your code here - accessor(s) */ 
  public int getPoints(){
    return this.points;
  }
  public boolean getTurn(){
    return this.isTurn;
  }
  /* your code here - mutator(s) */ 
  public void setPoints(int value){
    this.points = value;
  }
  public void setTurn(Boolean bool){
    this.isTurn = bool;
  }
  
}
