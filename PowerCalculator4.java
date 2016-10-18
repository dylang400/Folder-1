import java.math.BigInteger;
import javax.swing.JOptionPane;
import java.util.Scanner; 

/**
 * Prompts the user to enter two numbers, and then
 * computes the first number raised to the power of
 * the second. The BigInterger class is used to
 * handle arbitrarily large numbers.
 *JOptionPane vlass for graphical I/O.
 *
 *@author Dylan Gordon
 */
public class PowerCalculator4 {

   public static void main(String[] args) {
      String prompt = "Enter base and exponent.";
      String input = JOptionPane.showInputDialog(prompt);
      
      Scanner sc = new Scanner(input);
      String baseString = sc.next();
      BigInteger base = new BigInteger(baseString);	 
      int exponent = sc.nextInt();

      
      BigInteger result = base.pow(exponent);

      String output = base + "^" + exponent + " = " + result;
      JOptionPane.showMessageDialog(null, output);
   }
}