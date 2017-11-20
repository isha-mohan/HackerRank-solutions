import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
        for(int i =0;i<n;i++)
        {
            int operations = 0;
            String str = scan.next();
            int j=0;
            int k=str.length()-1;
            while(j<k)
            {
                operations += Math.abs(str.charAt(j)-str.charAt(k));
                j++;
                k--;
            }
            System.out.println(operations);
        }
    }
}
