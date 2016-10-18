import java.util.Scanner;

/**
 * Prompts the user to enter two numbers, and then
 * computes the first number raised to the power of
 * the second.
 *
 *@author Dylan Gordon
 */
public class PowerCalculator {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter base and exponent: ");

      // compute the result
      int base = in.nextInt();
      int exponent = in.nextInt();
      int result = (int) Math.pow(base, exponent);

      // displaying results
      String output = base + "^" + exponent + " = " + result;
      System.out.println(output);
   }
}