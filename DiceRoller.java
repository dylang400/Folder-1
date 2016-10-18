import java.util.Random;

/**
 * Simulates rolling a pair of dice.
 *
 * @author Dylan Gordon
 */
public class DiceRoller {

   public static void main(String[] args) {
   
      Random rand = new Random();
	
      // roll the dice and compute the sum.
      int die1 = 1 + rand.nextInt(6);
      int die2 = 1 + rand.nextInt(6);
      int sum = die1 + die2;
	 
	 // Display results.
	 System.out.println("First die: " + die1);
	 System.out.println("Second die: " + die2);
	 System.out.println("The sum is: " + sum);
   }
}