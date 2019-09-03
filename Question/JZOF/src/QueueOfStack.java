package JZOffer;

import java.util.Stack;

public class QueueOfStack {
    Stack<Integer>stack1 = new Stack<Integer>();
    Stack<Integer>stack2 = new Stack<Integer>();

    public void Push(int node) {
        if (stack1.empty())
            stack1.push(node);
        else {
            while (!stack1.empty())
                stack2.push(stack1.pop());
            stack1.push(node);
            while(!stack2.empty())
                stack1.push(stack2.pop());
        }
    }

    public int Pop(){
        if(stack1.empty())
            return 0;
        return stack1.pop();
    }

    public static void main(String args[]){
        QueueOfStack p = new QueueOfStack();
        p.Push(2);
        p.Push(1);
        p.Push(6);
        System.out.println(p.Pop());
        System.out.println(p.Pop());
        System.out.println(p.Pop());
    }
}
