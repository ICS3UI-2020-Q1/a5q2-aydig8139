import java.util.Scanner;

/**
 * Counts up to a given number
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for a positive integer
    System.out.println("Please enter a positive integer");

    //declare a variable for user input
    int userNum = input.nextInt();

    //create a for loop and declare a variable to count up from 
    for(int count = 1; count <= userNum; count++){
      
      //print out the numbers
      System.out.print(count + ", ");
    }
    
  }
}
