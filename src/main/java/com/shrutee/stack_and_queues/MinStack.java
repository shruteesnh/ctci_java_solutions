package com.shrutee.stack_and_queues;

import java.util.Stack;

/**
 * Approach - Use additional stack to keep track of the min.
 */
public class MinStack {

    Stack<Integer> stack = new Stack();
    Stack<Integer> min = new Stack();

    public MinStack(){
        stack = new Stack();
        min = new Stack();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int data){
        stack.push(data);
        if(min.peek() > data){
            min.push(data);
        }
    }

    public int pop(){
        int top = 0;
        if(!stack.isEmpty()){
             top = stack.pop();
        }

        if(min.peek() == top && min.peek() != Integer.MAX_VALUE){
            min.pop();
        }

        return top;
    }

    public int min(){
        if(!min.isEmpty() && min.peek() != Integer.MAX_VALUE){
           return min.peek();
        }
        return -1;
    }
}
