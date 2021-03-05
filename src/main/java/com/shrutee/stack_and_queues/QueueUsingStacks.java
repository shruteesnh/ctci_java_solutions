package com.shrutee.stack_and_queues;

import java.util.Stack;

/**
 *  Use two stacks to implement Queue.
 *  push will push to s1 always. If there are elements in s2 then first pop all the elements from s2 then push to s1.
 *  pop will always pop from s2, if there are elements in s1 then push all to s2 and then pop from s2
 */
public class QueueUsingStacks {

    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();

    public void push(int data){
        if(s1.isEmpty() && !s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(data);
    }

    public int pop(){
        if(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

}
