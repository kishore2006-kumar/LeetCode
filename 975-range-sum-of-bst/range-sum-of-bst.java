class Solution {

    int sum(TreeNode node, int low, int high, int sum) {
        if(node == null) return 0;

        if (node.val >= low && node.val <= high) {
            return node.val + rangeSumBST(node.left, low, high) + rangeSumBST(node.right, low, high);
        }

        return rangeSumBST(node.left, low, high) + rangeSumBST(node.right, low, high);
    }

    public int rangeSumBST(TreeNode node, int low, int high) {
        return sum(node, low, high, 0);
    }
}