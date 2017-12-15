import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        // Complete this function
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            Character ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch =='(')
                stack.push(ch);
            else if(ch == '}')
            {
                if(stack.isEmpty())
                    return "NO";
                if(stack.peek()=='{')
                    stack.pop();
            }
            else if(ch == ']')
            {
                if(stack.isEmpty())
                    return "NO";
                if(stack.peek()=='[')
                    stack.pop();
            }
            else
            {
                if(stack.isEmpty())
                    return "NO";
                if(stack.peek()=='(')
                    stack.pop();
            }
        }
        if(stack.isEmpty())
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
