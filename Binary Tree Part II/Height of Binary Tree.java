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

 //There can be recursive solution as well as iterative one using level order traversal
 //both have kind of similar time and space complexity
 class Solution {
    public int maxDepth(TreeNode root) {
       if(root==null)
       {
           return 0;
       } 
       return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}

//TC -O(N)[theta N]  SC-O(N)  [worst case when skewed binary tree]