import java.math.BigInteger;
import javax.swing.JOptionPane;
 
/**
 * Prompts the user to enter two numbers, and then
 * computes the first number raised to the power of
 * the second. The BigInterger class is used to
 * handle arbitrarily large numbers.
 *JOptionPane vlass for graphical I/O.
 *
 *@author Dylan Gordon
 */
public class PowerCalculator3 {

   public static void main(String[] args) {
      String baseString = JOptionPane.showInputDialog("Enter base.");
      BigInteger base = new BigInteger(baseString);

      String expString = JOptionPane.showInputDialog("Enter exponent.");	 
      int exponent = Integer.parseInt(expString);

      
      BigInteger result = base.pow(exponent);

      String output = base + "^" + exponent + " = " + result;
      JOptionPane.showMessageDialog(null, output);
   }
}