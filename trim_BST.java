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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        // if the given root node is null
        if(root == null)
            return null;
    
        //If node val > R , traverse & trim left part.
        // Else if node val < L , traverse and trim teh right part.
        if( root.val > R)
            return trimBST(root.left, L, R);
        else if(root.val < L)
            return trimBST(root.right, L, R);
        //else
        //{
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            return root;
        //}
        
    }
}
