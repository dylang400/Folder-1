import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Dylan Gordon
 */
public class MiddleSquare {

    public static void main(String[] args) {
        // Ask them to input
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        
	//Caculate
        String integer = input.next();
        BigInteger value = new BigInteger(integer);
        int exp = 2;
        BigInteger result = value.pow(exp);
        String answer = result.toString();
        int digits = answer.length();
        int split = digits/4;
       
	//Display
        String today = answer.substring(split, digits-split);
        System.out.println("Result: "+ today);
        
    }

}
