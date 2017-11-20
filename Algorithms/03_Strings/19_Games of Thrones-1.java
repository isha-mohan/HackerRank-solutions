import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        Map<Character, Integer> letter = new HashMap<>();
        for(char c: str.toCharArray())
        {
            if(letter.containsKey(c))
                letter.put(c,letter.get(c)+1);
            else
                letter.put(c,1);
        }
        
        int odd =0;
        int even = 0;
        
        for(Integer frequency: letter.values())
        {
            if(frequency %2 ==1)
            {
                odd++;
                continue;
            }
            if(frequency %2==0)
                even++;
        }
        if(odd>1)
        System.out.println("NO");
        else
            System.out.println("YES");
    }
}
