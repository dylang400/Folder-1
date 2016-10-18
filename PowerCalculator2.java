import java.util.Scanner;
import java.math.BigInteger;

/**
 * Prompts the user to enter two numbers, and then
 * computes the first number raised to the power of
 * the second. The BigInterger class is used to
 * handle arbitrarily large numbers.
 *
 *@author Dylan Gordon
 */
public class PowerCalculator2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter base and exponent: ");

      // compute result
      String baseString = sc.next();
      BigInteger base = new BigInteger(baseString);
      int exponent = sc.nextInt();
      BigInteger result = base.pow(exponent);

      // display result
      String output = base + "^" + exponent + " = " + result;
      System.out.println(output);
   }
}