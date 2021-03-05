package com.shrutee.stack_and_queues;

import java.util.Stack;

public class SortStack {

    public void sort(Stack<Integer> s){
        Stack<Integer> tempStack = new Stack<>();

        while(!s.isEmpty()){
            int temp = s.pop();
            if(!tempStack.isEmpty() && tempStack.peek() > temp){
                s.push(tempStack.pop());
            }
            tempStack.push(temp);
        }

        while(!tempStack.isEmpty()){
            s.push(tempStack.pop());
        }
    }
}
