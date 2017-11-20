import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        queries:
        for(int i =0;i<n;i++)
        {
            String str = scan.next();
            for(int j=1;j< (str.length()/2)+1;j++)
            {
                int left = Math.abs(str.charAt(j)-str.charAt(j-1));
                int right = Math.abs(str.charAt(str.length()-j-1)-str.charAt(str.length()-j));
                if(left!=right)
                {
                    System.out.println("Not Funny");
                    continue queries;
                }
            }
            System.out.println("Funny");
        }
    }
}
