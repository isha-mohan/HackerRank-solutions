import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pairs = scan.nextInt();
        
        for(int i = 0; i<pairs;i++)
        {
            String a = scan.next();
            String b = scan.next();
            
            Set<Character> aset = new HashSet<>();
            Set<Character> bset = new HashSet<>();
            
            for(int j=0;j<a.length();j++)
                aset.add(a.charAt(j));
            for(int k=0; k<b.length();k++)
                bset.add(b.charAt(k));
            
            aset.retainAll(bset);
            
            if(aset.size()>0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
