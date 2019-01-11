package leetcode.easy;

/**
@author :
		Gaurav Kaushik
		https://leetcode.com/kaushikgaurav08/
		https://www.linkedin.com/in/gvk28/ 		
        https://github.com/gauravkaushik
        
========================================================================
https://leetcode.com/problems/balanced-binary-tree/
========================================================================

Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
a binary tree in which the depth of the two subtrees of every node never differ by more than 1.


Example 1:
Given the following tree [3,9,20,null,null,15,7]:

    3
   / \
  9  20
    /  \
   15   7
Return true.

Example 2:
Given the following tree [1,2,2,3,3,null,null,4,4]:

       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
Return false.
*/

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        return height(root)!=-1;
    }
    
    private int height(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int lH = height(root.left);
        if(lH == -1)
            return -1;
        
        int rH = height(root.right);
        if(rH == -1)
            return -1;
        
        if( Math.abs( lH - rH ) > 1 )
            return -1;
        
        return ( 1 + Math.max(lH,rH) );
    }
    
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}