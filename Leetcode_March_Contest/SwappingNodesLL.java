package Leetcode_March_Contest;

import java.util.ArrayList;
import java.util.List;

/**
Swapping Nodes in a Linked List:-

You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values 
of the kth node from the beginning and the kth node from the end (the list is 1-indexed).


 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SwappingNodesLL {
    public ListNode swapNodes(ListNode head, int k) {
        
        List<Integer> list = new ArrayList<>();
        
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        
        int x=list.get(k-1);
        int y=list.get(list.size()-k);
        
        list.set(k-1, y);
        list.set(list.size()-k, x);
        
        ListNode heads=new ListNode(list.get(0));
        ListNode temp = heads;
        
        for(int i=1; i<list.size(); i++)
        {
            ListNode curr = new ListNode(list.get(i));
            temp.next = curr;
            temp=temp.next;
        }
        
        return heads;
    }
}