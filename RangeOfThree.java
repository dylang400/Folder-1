import java.util.Random;
/**
 *
 * @author Dylan Gordon
 */
public class RangeOfThree {

    public static void main(String[] args) {
        Random rand = new Random();
        int n1 = 10 + rand.nextInt(89);
        int n2 = 10 + rand.nextInt(89);
        int n3 = 10 + rand.nextInt(89);
        
	// Stores max value as max
        int n4 = Math.max(n1,n2);
        int max = Math.max(n4,n3);
        // Stores min value as min
        int n5 = Math.min(n1,n2);
        int min = Math.min(n5,n3);
        int value = max-min;
        
	//Displays Values
        String output = n1 + " " + n2 + " " + n3;
        System.out.println("Random numbers: " + output);
        System.out.println("Range: " + value);
        
        
    }

}
