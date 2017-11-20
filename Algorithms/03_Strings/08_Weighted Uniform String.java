import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        
        Set<Integer> weights = new HashSet<>();
        char prevletter = ' ';
        int currentweight =0;
        for(char ch: str.toCharArray())
        {
            if(ch != prevletter)
                currentweight = ch - 'a' + 1;
            else
                currentweight += ch - 'a' + 1;
            prevletter = ch;
            weights.add(currentweight);
        }
        
        for(int i=0;i<n;i++)
        {
            int x = scan.nextInt();
            if(weights.contains(x))
                System.out.println("Yes");
            else 
                System.out.println("No");
        }
        }
    }
