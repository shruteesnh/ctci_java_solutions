package com.shrutee.linked_lists;

/**
 * You have 2 numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order,such that the ones's digit
 * is at the head of the list. Add the numbers and return the sum as linked list.
 * 7 -> 1-> 6 + 5 -> 9-> 2 (617+295)
 * 2 ->1->9 = 912
 */
public class SumList {

    /**
     *  Time Comlexity - O(n) where n is he length of the longer list
     *  Space Complexity - O(n) creating a result list
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode sumList(ListNode l1, ListNode l2){

        if(l1 == null && l2 == null){
            return null;
        }

        ListNode dummy = new ListNode(-1);
        ListNode l3 = dummy;

        int carry = 0;

        while(l1 != null || l2 != null){
            int l1_data = (l1 == null) ? 0 : l1.val;
            int l2_data = (l2 == null) ? 0 : l2.val;

            int sum = carry;
            sum += l1_data + l2_data;
            int lastDigit = sum%10;
            carry = sum/10;
            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;

            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }

            l3 = l3.next;
        }

        if(carry > 0){
            ListNode carryNode = new ListNode(carry);
            l3.next = carryNode;
            l3 = l3.next;

        }
        return dummy.next;
    }
}
