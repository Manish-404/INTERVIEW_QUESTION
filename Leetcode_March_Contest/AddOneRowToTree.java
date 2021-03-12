package Leetcode_March_Contest;
/**
 * Given the root of a binary tree and two integers val and depth, add a row of nodes with value val at the given depth depth.

Note that the root node is at depth 1.

The adding rule is:

Given the integer depth, for each not null tree node cur at the depth depth - 1, create two tree nodes with value val as cur's left subtree root and right subtree root.
cur's original left subtree should be the left subtree of the new left subtree root.
cur's original right subtree should be the right subtree of the new right subtree root.
If depth == 1 that means there is no depth depth - 1 at all, then create a tree node with value val as the new root of the whole original tree, and the original tree is the new root's left subtree.
 * 
 * 
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
class TreeNode 
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) 
	{
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class AddOneRowToTree 
{
	public TreeNode addOneRow(TreeNode root, int val, int depth) 
	{
        if(depth == 1)
        {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        insert(root, depth, val, 1);
        return root;
    }
    
    public void insert(TreeNode node, int depth, int val, int currentDepth)
    {
    	if(node == null) return;
        if(currentDepth == depth-1)
        {
            TreeNode temp = node.left;
            node.left=new TreeNode(val);
            node.left.left = temp;
            temp = node.right;
            node.right = new TreeNode(val);
            node.right.right = temp;
            
        }
        else
        {
            insert(node.left, depth, val, currentDepth+1);
            insert(node.right, depth, val, currentDepth+1);
        }
    }
}

/*
o/p:-
Input: root = [4,2,6,3,1,5], val = 1, depth = 2
Output: [4,1,1,2,null,null,6,3,1,5]

Input: root = [4,2,null,3,1], val = 1, depth = 3
Output: [4,2,null,1,1,3,null,null,1]
*/