//Problem:
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {

        TreeNode node = BST(nums, 0, nums.length - 1);
        return node;
    }

    public static TreeNode BST(int input[], int lo, int hi) {

        if (lo > hi) {
            // invalid
            return null;
        }

        int mid = lo + (hi - lo) / 2;

        int data = input[mid];
        TreeNode lc = BST(input, lo, mid - 1);
        TreeNode rc = BST(input, mid + 1, hi);
        TreeNode node = new TreeNode(data, lc, rc);

        return node;
    }
}