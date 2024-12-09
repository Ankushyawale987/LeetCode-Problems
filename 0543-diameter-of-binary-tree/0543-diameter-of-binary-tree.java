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
    public static int Height(TreeNode root){
        if(root == null) return 0;
        int l = Height(root.left);
        int r = Height(root.right);
        int max = Math.max(l, r ) + 1;
        return max;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);
        int max = Height(root.left) + Height(root.right);
        return Math.max(max, Math.max(l, r));
    }
}