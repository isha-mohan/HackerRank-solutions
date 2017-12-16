import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip = mealCost*(double)tipPercent/100.0;
        double tax = mealCost*(double)taxPercent/100.0;
        double totalCost = mealCost+tip+tax;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost1 = (int) Math.round(totalCost);
      
        // Print your result
        System.out.println("The total meal cost is "+totalCost1+" dollars.");
    }
}
