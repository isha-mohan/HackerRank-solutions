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
        for(int i=0;i<n;i++)
        {
            String str = sc.next();
            int len = str.length();
            for(int j=0;j<len;j=j+2)
                System.out.print(str.charAt(j));
            System.out.print(" ");
            for(int k=1;k<len;k=k+2)
                System.out.print(str.charAt(k));
            System.out.println();
        }
    }
}
