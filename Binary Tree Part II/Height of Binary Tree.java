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








//Iterative Solution
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
      //iterative solution
       if(root==null)
       {
           return 0;
       }
      int maxdepth=1;
      Deque<TreeNode> q = new LinkedList<TreeNode>();
      q.add(root);
      q.add(null);
      while(q.size()>1)
      {
          TreeNode curr=q.remove();
          if(curr==null)
          {
              maxdepth++;
              q.add(null);
              continue;
          }
          if(curr.left!=null)
          {
              q.add(curr.left);
          }
           if(curr.right!=null)
          {
              q.add(curr.right);
          }
          
      }

      return maxdepth;
    }
}

//TC -O(N)[theta N]  SC-O(N) [worst case when binary tree is complete]