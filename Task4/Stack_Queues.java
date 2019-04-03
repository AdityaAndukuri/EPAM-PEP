import java.io.*;
import java.util.*;

public class Stack_Queues {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int stack[],top1=-1,temp[],top2=-1;
        stack = new int[1000000];
        temp = new int[1000000];
        int q,choice,x;
        Scanner sc = new Scanner(System.in);
        q=sc.nextInt();
        while(q-->0)
        {
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                x=sc.nextInt();
                stack[++top1]=x;
                break;
                case 2:
                int k = top1;
                while(top1>=0)
                {
                    temp[++top2]=stack[top1--];

                }
                top2--;
                while(top2>=0)
                {
                    stack[++top1]=temp[top2--];
                }
                break;
                case 3:
                System.out.println(stack[0]);
                break;
            }
        }
    }
}

