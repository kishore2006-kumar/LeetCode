class Solution {
    public int sumNumbers(TreeNode root) {
        return sumHelper(root, 0);
    }

    int sumHelper(TreeNode node, int value) {
        if(node == null) return 0;

        value = value * 10 + node.val;
        if(node.left == null && node.right == null) return value;
        return sumHelper(node.left, value) + sumHelper(node.right, value);
    }
}