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
    
   public List<List<Integer>> levelOrderBottom(TreeNode root) 
   {     
    List < List < Integer > > res = new ArrayList < > ();
    
       if(root == null){
           return res;
       }
       
    Queue<TreeNode> queue = new ArrayDeque < >();
       
    queue.add( root );
       
    while(queue.size() != 0) {     
        
        int size = queue.size();
        
        ArrayList <Integer> x = new ArrayList<>();         
        while(size > 0){     
            TreeNode temp = queue.remove();
            
            x.add(temp.val);
            
            if(temp.left != null) {
                 queue.remove(temp.left);
            }  
               
            if(temp.right != null)  {
                queue.remove(temp.right);
            } 
            size--;
                       
        }
        res.add(0 ,  x);
    }     
    return res; 
}
}
