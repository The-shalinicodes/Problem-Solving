/**
 * Definition for a binary tree node. public class TreeNode { int data; TreeNode left; TreeNode
 * right; TreeNode(int val) { data = val; left = null, right = null } }
 */
class Solution {
  void inorderHelper(TreeNode root, List<Integer> res) {
    if (root == null) return;
    inorderHelper(root.left, res);
    res.add(root.data);
    inorderHelper(root.right, res);
  }

  public List<Integer> inorder(TreeNode root) {
    // your code goes here
    List<Integer> res = new ArrayList<>();
    inorderHelper(root, res);
    return res;
  }
}
