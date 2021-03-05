package com.shrutee.linked_lists;

import java.util.Stack;

/**
 * Check if a linked list is a palindrome
 */
public class CheckPalindrome {

    /**
     * Approach1 - Use stack and push half of the nodes and pop one by one. If at the end stack is empty then the list is a palindrome.
     * @param node
     * @return true if the list is a palindrome
     */

    public static boolean isPalindrome(ListNode node){

        Stack<Integer> stack = new Stack();

        int size = 0;
        ListNode current = node;
        while(current != null){
            size++;
            current = current.next;
        }

        boolean even = size % 2 == 0 ? true: false;

        int i = 0;

        while(node != null && i < size/2){
            stack.push(node.val);
            node = node.next;
            i++;
        }

        if(!even){
            node = node.next;
        }

        while(node != null){

            if(!stack.isEmpty() && node.val == stack.peek()){
                stack.pop();
            }
            node = node.next;
        }

        return stack.isEmpty();
    }

    /**
     * Approach 2 - Reverse the list and compare with the original list. If they are equal then its a palindrome
     * Time Complexity -
     * Space Complexity -
     *
     * @param node
     * @return
     */
    public static boolean isPalindrome1(ListNode node){

        ListNode reverse = reverseList(node);

        while(node != null && reverse != null){
            if(node.val != reverse.val){
                return false;
            }
            node = node.next;
            reverse = reverse.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode node){
        ListNode previous = null;
        ListNode next = null;
        ListNode current = node;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
