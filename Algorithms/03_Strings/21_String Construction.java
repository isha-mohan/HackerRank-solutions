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
            String str = scan.next();
            Set<Character> unique = new HashSet<>();
            for(char ch: str.toCharArray())
            {
                unique.add(ch);
            }
            System.out.println(unique.size());
            unique.clear();
        }
    }
}
