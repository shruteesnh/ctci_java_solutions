package com.shrutee.linked_lists;

import java.util.HashSet;
import java.util.Set;

/**
 * Remove duplicates from unsorted linked list
 * Follow up - Do without additional buffer
 */
public class RemoveDups {

    /** Approach 1 : Use a Hashtable to keep track of the items and work on the list,
     * Time Complexity - O(n)
     * Space Complexity - O(n)
     *
     * @param n head of the ListNode
     */

    public static void removeDups(ListNode n){

        ListNode current = n;

        if(current == null){
            return;
        }
        Set<Integer> hs = new HashSet();
        ListNode previous = null;

        while(current != null){
            if(hs.contains(current.val)){
                previous.next = current.next;
            }else{
                hs.add(current.val);
                previous= current;
            }
            current = current.next;
        }
    }

    /** Approach 2 : Without additional bufffer, we would have to use 2 loops to keep track of the duplicate items
     * Time Complexity - O(n^2)
     * Space Complexity - O(1)
     *
     * @param n head of the ListNode
     */

    public static void removeDupsWithoutBuffer(ListNode n){

        ListNode current = n;
        while(current != null){
            ListNode runner = current;
            while(runner.next != null){
                if(runner.next.val == current.val){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            current = current.next;
        }

    }
}
