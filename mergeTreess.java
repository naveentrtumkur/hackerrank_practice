/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //If t1 is null then return t2 value in place of t1.
        if(t1 == null )
            return t2;
        //if t2 is null then simply return t1 value.
        else if (t2 == null)
            return t1;
        else
        {
            //merge the sum into first tree.
            t1.val = (t1!=null)?t1.val+t2.val:t2.val;
            t1.left = mergeTrees(t1.left,t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
            
            return t1;
        }
    }
}
