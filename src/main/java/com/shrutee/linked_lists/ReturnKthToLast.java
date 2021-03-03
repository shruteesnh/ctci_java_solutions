package com.shrutee.linked_lists;

/**
 * Find kth to last element in a singly linked list
 */
public class ReturnKthToLast {

    /**
     * Brute force approach - find the size of the list and go to the kth element
     * Time Complexity - O(n)
     * Space complexity - O(1)
     * @param n
     * @param k
     * @return
     */
    public static int kthLastElement(ListNode n, int k){

        ListNode current = n;
        int size = 0;
        while(current != null){
            size++;
            current= current.next;
        }

        if(size < k){
            return -1;
        }

        int i = 0;
        while(n != null && i <= size -k-1){
            n= n.next;
            i++;
        }

        return n.val;

    }

    /**
     * Two Pointer approach - Start with 2 pointers, k distance apart
     * Time Complexity - O(n)
     * Space complexity - O(1)
     * @param n
     * @param k
     * @return
     */
    public static int kthLastElement2(ListNode n, int k){

        ListNode pointer1 = n;
        ListNode pointer2 = n;

        for(int i =0;i<k ;i++){

            if(pointer1 == null) return -1;
            pointer1 = pointer1.next;
        }

        while(pointer1!= null){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer2.val;
    }
}
