class Solution {

    public static void inOrderPrint(TreeNode node, List<Integer> list) {
        if(node == null) return;

        inOrderPrint(node.left, list);
        list.add(node.val);
        inOrderPrint(node.right, list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inOrderPrint(root, list);
        return list;
    }
}