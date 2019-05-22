import java.util.Scanner;
import java.util.Random;
public class Assignment1
{
  public static void main(String[] args)
  {
    printMessage();
  }
  
  static void printMessage()
  {
    int r = RandomConverter();

    int ans = userInput();
    
    int count = 0;

    while (ans != r)
    {
    if(ans>r)
    {
      System.out.println("Too high");
      ans = multipleTries();
      count++;
    }
    else if(ans<r)
    {
      System.out.println("Too low");
      ans = multipleTries();
      count++;
    }
    }
      if(count < 1)
      {
        System.out.println("Congrats! You guessed it on your first try!");
      }
      else
      {
      System.out.println("Congrats! You won after " + count + " tries!");
      }
    
  }
  
  static int multipleTries()
  {
    Scanner memes = new Scanner(System.in);
    System.out.print("Try again");
    
    int t = memes.nextInt();
    return t;
  }
  
  static int userInput()
  {
    Scanner memes = new Scanner(System.in);
    System.out.println("I'm thinking of a number between 1-20.");

    int tries = memes.nextInt();
    return tries;
      
       
  }
  
  static int RandomConverter()  //7
  {
    
    Random r = new Random();
    
    int randomValue = r.nextInt(20) + 1;
    
    return randomValue;
    
  }
  
  
}