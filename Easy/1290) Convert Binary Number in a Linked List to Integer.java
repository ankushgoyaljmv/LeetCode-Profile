//Problem:
//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

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

    public int getDecimalValue(ListNode head) {

        ListNode temp = head;
        int size = 0;
        int res = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int pow = size - 1;
        temp = head;

        while (temp != null) {

            res +=  temp.val * (int)Math.pow(2, pow);
            pow--;
            temp = temp.next;
        }
        return res;
    }

}