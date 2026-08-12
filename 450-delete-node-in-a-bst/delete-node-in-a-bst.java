class Solution {

    TreeNode min(TreeNode node) {
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }

    public TreeNode deleteNode(TreeNode node, int val) {
        if(node == null) return node;
        
        if(val < node.val) {
            node.left = deleteNode(node.left, val);
        }
        else if(val > node.val) {
            node.right = deleteNode(node.right, val);
        }
        
        else {
            if(node.left == null && node.right == null) return null;
            
            if(node.left == null) return node.right;
            if(node.right == null) return node.left;
            
            TreeNode successor = min(node.right);
            node.val = successor.val;
            node.right = deleteNode(node.right, successor.val);
        }
        return node;
    }
}

