//Problem:
//https://leetcode.com/problems/middle-of-the-linked-list/submissions/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
       // 2 pointer approach    
        while(fast != null && fast.next != null ){
            
            slow = slow.next; // it will point ot next node only
            fast = fast.next.next; // it will point to next to next node
        }
        
        return slow;
        
    }
}