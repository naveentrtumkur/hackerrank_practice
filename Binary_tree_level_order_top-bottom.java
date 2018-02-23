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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        // This is a classic problem to solve binary tree level order traversal from top to bottom.
        List list = new ArrayList<>();
        if( root == null)
            return list;
        
        // Declare and initialize a queue, since we are using a BFS approach to solve this problem.
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        // Initially push root onto the queue.
        q.add(root);
        while(!q.isEmpty())
        {
            List level = new ArrayList<>();
            int size = q.size();
            for(int i=0 ; i<size; i++)
            {
                TreeNode cur = q.remove();
                level.add(cur.val);
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
            }
            list.add(level);
        }
        return list;
        
    }
}
