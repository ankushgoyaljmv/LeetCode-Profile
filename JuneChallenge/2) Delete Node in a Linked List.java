//Problem:
//https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3348/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //Since we have no access to any other element in the linked list but only the give node , so we can only use node only.  We update the node value with the value of the next node. 
       // 1.(Node.next) represent the next node and Node.next.val represent the next data.
        //2 . node.next.next represents the next to next node
        node.val = node.next.val;
        node.next = node.next.next;
        
        
    }
}