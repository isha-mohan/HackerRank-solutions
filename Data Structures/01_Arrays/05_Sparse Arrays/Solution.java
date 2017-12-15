import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        for(int i=0;i<n;i++)
        {
            array[i] = sc.next();
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            String query = sc.next();
            int count = 0 ;
            for(int j=0;j<n;j++)
            {
                if(array[j].equals(query))
                    count++;
            }
            System.out.println(count);
        }
    }
}
