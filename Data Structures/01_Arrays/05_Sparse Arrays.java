/*
Algorithm
1. Take input the number of strings 
     int n = sc.nextInt();
2. Create a string array having n elements
3. Store the n strings in the array
4. Take input the number of queries
5. For each query
     5.1 Input a string
     5.2 Initialize count = 0
     5.3 Traverse the string array
     5.4 If string array element is equal to query then increment count
     5.5 Print count
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
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
