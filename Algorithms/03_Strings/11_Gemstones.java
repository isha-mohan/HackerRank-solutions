import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashSet<Character> base = new HashSet<>();
        HashSet<Character> curr = new HashSet<>();
        
        for(char ch ='a';ch<='z';ch++)
            base.add(ch);
        
        for(int i =0;i<n;i++)
        {
            curr.clear();
            String str = scan.next();
            for(char ch: str.toCharArray())
            {
                curr.add(ch);
            }
            base.retainAll(curr);
        }
        System.out.println(base.size());
    }
}
