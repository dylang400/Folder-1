import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Dylan Gordon
 */
public class Duration {

    public static void main(String[] args) {
        // Ask them to input
        System.out.print("Enter number of seconds: ");
        Scanner x = new Scanner(System.in);
            //Calculating
            int things = x.nextInt();
            int hours = things/3600;
            int min = (things-(hours*3600))/60;
            int sec = things-((hours*3600)+min*60);
                //Formating
                DecimalFormat better = new DecimalFormat("00");
                String formatHours = better.format(hours);
                String formatMin = better.format(min);
                String formatSec = better.format(sec);
                // Display
                String output = formatHours + ":" + formatMin + ":" + formatSec;
                System.out.println("Duration: " + output);
        
    }

}
