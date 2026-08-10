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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>list=new ArrayList<>();
        if(root==null)return list;
        helper(root,"",list);
        return list;
    }
    public void helper(TreeNode root,String res,List<String>list){
        if(root==null)return;
        if(root.left==null&& root.right==null){
            list.add(res+root.val);
            return;
        }
        res=res+root.val+"->";
        helper(root.left,res,list);
        helper(root.right,res,list);
    }
}