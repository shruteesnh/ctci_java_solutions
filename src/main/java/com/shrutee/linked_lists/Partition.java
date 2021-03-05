package com.shrutee.linked_lists;

/**
 * Partition the list around a value x such that all nodes less than x comes before all nodes greater than or equal to x.
 * 3 ->5->8->5->10->2->1 partition = 5
 * outputs = 3->1->2    10->5->5->8
 */
public class Partition {

    // TODO Check implementation again


    public static void main(String[] args) {
        ListNode ls = new ListNode(3);
        ls.next = new ListNode(11);
        ls.next.next = new ListNode(8);
        ls.next.next.next = new ListNode(5);
        ls.next.next.next.next = new ListNode(10);
        ls.next.next.next.next.next = new ListNode(2);
        ls.next.next.next.next.next.next = new ListNode(1);

        ListNode res = partitionList(ls, 5);
        while(res != null){
            System.out.print(res.val + " -> ");
            res = res.next;
        }
    }

    public static ListNode partitionList(ListNode node, int x){

        if(node == null) return null;

        ListNode head = node;
        ListNode tail = node;

        while(node != null){
            ListNode next = node.next;
            if(node.val < x){
                node.next = head;
                head = node;
            }else{
                tail.next = node;
                tail = node;
            }
            node = next;
        }

        tail.next = null;

        return head;

    }
}
