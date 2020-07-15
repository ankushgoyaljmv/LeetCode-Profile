//Problem:
//https://leetcode.com/problems/same-tree/


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
    public boolean isSameTree(TreeNode p, TreeNode q) { 
        
         // p and q are both null
        if(p == null && q == null){
            return true;
        }
        
         // one of p and q is null                                              
        if(p == null || q == null){
            return false;
        }
         
        if(p.val != q.val){
            return false;
        }
         
        //check for left
        boolean left =  isSameTree( p.left , q.left);  
        
        //check for right
        boolean right =  isSameTree( p.right , q.right);
                                                       
        return left && right;
                                                          
        
    }
}
