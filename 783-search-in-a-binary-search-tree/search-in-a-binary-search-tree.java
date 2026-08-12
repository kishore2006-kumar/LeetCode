class Solution {
    public TreeNode searchBST(TreeNode node, int val) {
        if(node == null) return node;
        
        if(val < node.val) {
            return searchBST(node.left, val);
        }
        if(val > node.val) {
            return searchBST(node.right, val);
        }
        if(node.val == val) return node;
        return null;
    }
}