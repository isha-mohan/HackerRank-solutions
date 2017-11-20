import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++)
        {
            int count =0;
            String str = scan.next();
            for(int j=0;j<str.length();j++)
            {
                char ch = str.charAt(j);
                if(!stack.isEmpty() && ch == stack.peek())
                {
                    count++;
                }
                else
                {
                    stack.push(ch);
                }
            }
            System.out.println(count);
            stack.clear();
        }
    }
}
