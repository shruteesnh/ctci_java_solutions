package com.shrutee.linked_lists;

/**
 * Delete a node in the middle of a singly linked list, given only access to that node
 *
 * a-b-c-d-e
 * a-b-d-e after c is deleted
 */
public class DeleteMiddleNode {

    /**
     * Approach - Copy the value of the next node to the given node and delete the next node
     * Time Complexity - O(n)
     * Space COmplexity - O(1)
     * @param node
     * @return
     */
    public void deleteMiddle(ListNode node){

        if(node == null){
            return;
        }

        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }
}
