//Recursive Solution
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
        {
            return null;
        }
        if(val>root.val)
        {
            return searchBST(root.right,val);
        }
        else if(val<root.val)
        {
            return searchBST(root.left,val);
        }
        return root;
    }
}



//iterative solution
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
       while(root!=null)
       {
           if(root.val==val)
           {
               return root;
           }
           else if(val>root.val)
           {
               root=root.right;
           }
           else
           {
               root=root.left;
           }
       }
       return root;
    }
}