import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner scan = new Scanner(System.in);
    String time = scan.nextLine();
    String [] timeArray = time.split(":");
    String hr = timeArray[0];
    String min = timeArray[1];
    String sec = timeArray[2].substring(0, 2);
    
    int Hours;
    
    if (timeArray[2].substring(2, 4).equalsIgnoreCase("PM")) {
      if (Integer.parseInt(hr) < 12) {
        Hours = Integer.parseInt(hr);
        Hours += 12;
        hr = Integer.toString(Hours);
      }
    }
    if (timeArray[2].substring(2, 4).equalsIgnoreCase("AM")) {
      if (Integer.parseInt(hr) == 12) {
        hr = "00";
      }
    }
    System.out.println(hr + ":" + min + ":" + sec);
   
  }
}
