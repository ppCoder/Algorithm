package JZOffer;

import java.util.ArrayList;
import java.util.Stack;

public class StackMin {

    Stack<Integer> stack = new Stack<Integer>();

    public void push(int node) {
        if(stack.empty()){
            stack.push(node);
            stack.push(node);
        }
        else{
            int min = stack.pop();
            if(node > min){
                stack.push(node);
                stack.push(min);
            }
            else{
                stack.push(node);
                stack.push(node);
            }
        }
    }

    public void pop() {
        int min = stack.pop();
        int top = stack.pop();
        if(top == min){
            Stack<Integer> s = new Stack<Integer>();
            while(!stack.empty()){

            }
        }
    }

    public int top() {
        int min = stack.pop();
        int top = stack.pop();
        stack.push(top);
        stack.push(min);
        return top;
    }

    public int min() {
        int min = stack.pop();
        return min;
    }
}
