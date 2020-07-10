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
    public int widthOfBinaryTree(TreeNode root) {
    if(root == null)
        return 0;
    Queue<TreeNode> q = new LinkedList<>();
    HashMap<TreeNode, Integer> map = new HashMap<>();
    q.offer(root);
    map.put(root, 1);
    int max = -1;
    while(!q.isEmpty()){
        int size = q.size();
        int start = -1, end = -1;
        for(int i = 0; i < size; i++){
            TreeNode temp = q.poll();
            if(i == 0) 
                start = map.get(temp);
            if(i == size - 1)
                end = map.get(temp);
            if(temp.left != null){
                q.offer(temp.left);
                map.put(temp.left, map.get(temp) * 2);
            }
            if(temp.right != null){
                q.offer(temp.right);
                map.put(temp.right, map.get(temp) * 2 + 1);
            }
        }
        max = max > (end-start + 1) ? max : (end-start + 1);
    }
    return max;
}
}
