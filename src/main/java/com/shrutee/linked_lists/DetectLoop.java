package com.shrutee.linked_lists;

/**
 * Given a linked list which might contain a loop, implement an algorithm that returns the node at the beginning of the loop if(one exists)
 * A -> B -> C -> D -> E -> C returns C
 */
public class DetectLoop {

    public static ListNode detectLoop(ListNode node){

        if(node  == null){
            return null;
        }

        ListNode fast = node;
        ListNode slow = node;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }

        if(fast == null || fast.next == null){
            return null;
        }

        slow = node;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }



}
