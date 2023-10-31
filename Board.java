/*
 * Activity 2.5.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class  Board
{
  private String solvedPhrase;
  private String phrase;
  private int currentLetterValue; 

  /* your code here - constructor(s) */ 
  Board() {
    solvedPhrase = "";
    phrase = loadPhrase();
    setLetterValue();
    System.out.println("Phrase: " + phrase); //temp test code
  }
  /* your code here - accessor(s) */
  public int getLetterValue() (
    return currentLetterValue;
  )
  public String getSolvedPhrase(){
    return solvedPhrase;
  }
  public String getCurrentPhrase(){
	return phrase;
  }

  /* your code here - mutator(s)  */

  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    try 
    {
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }  
      else
      {
        solvedPhrase += "_ ";
      }
    }  
    
    return tempPhrase;
  }  

  /* Takes a letter input, updates solvedPhrase if the letter is in the phrase, 
   * and returns a boolean based on if the letter is in the phrase
   * 
   * Precondition:
   *  The guess argument must be a single letter
   * 
   * Postcondition:
   *  If guessLetter() returns true,
   *  solvedPhrase is updated to have the specified letter filled in the phrase where a _ character would be
   *  
   *  If guessLetter() returns false,
   *  solvedPhrase is not updated
   */
  public boolean guessLetter(String guess)
  {
    //creates a new boolean variable foundLetter that is initialized to false
    boolean foundLetter = false;
    //creates a new String variable newSolvedPhrase that is empty string
    String newSolvedPhrase = "";
    //a for loop that iterates for the length of phrase
    for (int i = 0; i < phrase.length(); i++)
    {
      //an if statement that checks whether the letter at index i in phrase is equal to the letter guessed
      if (phrase.substring(i, i + 1).equals(guess))
      {
        //the newSolvedPhrase has the guess and a space added to it
        newSolvedPhrase += guess + " ";
        //foundLetter is set to true
        foundLetter = true;
      }
      //if the letter at index i in phrase is not equal to the letter guessed
      else
      {
        // newSolvedPhrase gets the character at the index i*2 in solvedPhrase and a space added to it
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";  
      }
    }
    //solvedPhrase is set to newSolvedPhrase
    solvedPhrase = newSolvedPhrase;
    //foundLetter is returned
    return foundLetter;
  } 
} 
