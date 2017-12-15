import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> trackStack = new Stack<>();
        int q = scan.nextInt();
        int max = -1;
        for(int i=0;i<q;i++)
        {
            int query = scan.nextInt();
            if(query ==1)
            {
                int element = scan.nextInt();
                stack.push(element);
                if(stack.size()==1)
                    trackStack.push(element);
                else
                {
                    if(element>=trackStack.peek())
                        trackStack.push(element);
                    else
                        trackStack.push(trackStack.peek());
                }
            }
            else if(query==2)
            {
                stack.pop();
                trackStack.pop();
            }
            else if(query==3)
            {
                System.out.println(trackStack.peek());
            }
        }
    }
}
