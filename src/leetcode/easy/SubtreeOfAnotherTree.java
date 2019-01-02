package leetcode.easy;

/**
@author :
		Gaurav Kaushik
		https://leetcode.com/kaushikgaurav08/
		https://www.linkedin.com/in/gvk28/ 		
        https://github.com/gauravkaushik
========================================================================
https://leetcode.com/problems/subtree-of-another-tree/
========================================================================

Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.
Example 2:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.

*/

public class SubtreeOfAnotherTree {
    
    //checks if the two trees are exactly equal
    public boolean helper(TreeNode s, TreeNode t) {
        if(s==null && t==null)
            return true;
        if(s==null || t==null)
            return false;
        if(s.val != t.val)
            return false;
        else
        {
            return helper(s.left,t.left) && helper(s.right, t.right);
        }
    }
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        
        return inorder(s,t);        
    }
    
    public boolean inorder(TreeNode s, TreeNode t) {
        if(s==null)
            return false;
        if(helper(s,t))
            return true;
        else
            return inorder(s.left,t) || inorder(s.right,t);
    }
    
    //Definition for a binary tree node.
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}