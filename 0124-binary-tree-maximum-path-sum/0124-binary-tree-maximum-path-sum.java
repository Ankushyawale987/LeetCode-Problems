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
    int ans = Integer.MIN_VALUE;
    public int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = sum(root.left);
        int r = sum(root.right);

        int tempSum = Math.max(root.val, Math.max(l + root.val, r + root.val));
        ans = Math.max(ans, Math.max(tempSum, root.val + l + r));
        return tempSum;
    }
    public int maxPathSum(TreeNode root) {
        sum(root);
        return ans;
    }
}