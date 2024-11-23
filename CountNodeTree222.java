public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = getHeight(root, true); // Height of the left subtree
        int rightHeight = getHeight(root, false); // Height of the right subtree
        
        // If left and right subtree have the same height, it's a perfect binary tree
        if (leftHeight == rightHeight) {
            // If the left and right subtrees are of the same height, then it's a perfect binary tree.
            return (1 << leftHeight) - 1; // 2^height - 1
        } else {
            // Otherwise, recursively count the nodes in both subtrees
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    // Helper method to calculate the height of a subtree
    private int getHeight(TreeNode node, boolean isLeft) {
        int height = 0;
        while (node != null) {
            height++;
            node = isLeft ? node.left : node.right;
        }
        return height;
    }
}



Example 2:
Input: root = []
Output: 0
    
Example 3:
Input: root = [1]
Output: 1
