package com.shrutee.linked_lists;

public class CheckIntersection {

    /** Approach - Find the size of the two lists. They intersect if the tail nodes are equal.
     * Get the longer node and move the pointer of the longer node to the node k distance apart so that both the longList pointer and the shortList pointer
     * are the same distance form the intersecting node.
     * Time complexity - O(n1 + n2) where n1 is the length of 1st list and n2 is the length of 2nd list
     * Space Complexity - O(1)
     *
     * @param l1
     * @param l2
     * @return teh intersecting node
     */
    public static ListNode intersection(ListNode l1, ListNode l2){

        if(l1 == null || l2 == null){
            return null;
        }

        int size1 = listSize(l1);
        int size2 = listSize(l2);

        ListNode longList = size1 > size2 ? l1:l2;
        ListNode shortList = size1 < size2 ? l1:l2;

        if(!getTail(longList).equals(getTail(shortList))){
            return null;
        }

        int k = listSize(longList) - listSize(shortList);

        for(int i =0;i<k;i++){
            longList = longList.next;
        }

        while(longList != shortList){
            longList = longList.next;
            shortList = shortList.next;
        }
        return longList;
    }

    public static int listSize(ListNode n){
        int size = 0;
        while(n != null){
            size++;
            n = n.next;
        }
        return size;
    }

    public static ListNode getTail(ListNode n){
        while(n != null){
            n = n.next;
        }
        return n;
    }
}
