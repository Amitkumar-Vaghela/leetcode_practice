import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            findPaths(root, "", paths);
        }
        return paths;
    }
    
    private void findPaths(TreeNode node, String path, List<String> paths) {
        // Check if this is a leaf node
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
        }
        // Explore the left subtree
        if (node.left != null) {
            findPaths(node.left, path + node.val + "->", paths);
        }
        // Explore the right subtree
        if (node.right != null) {
            findPaths(node.right, path + node.val + "->", paths);
        }
    }
}


/*

Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]


Input: root = [1]
Output: ["1"]
 


*/
