class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        boolean left2Right = true;
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new LinkedList<>();

            for(int i=0; i<size; i++) {
                TreeNode curr = queue.poll();
                
                if(left2Right) temp.addLast(curr.val);
                else temp.addFirst(curr.val);

                if(curr.left != null) queue.offer(curr.left);
                if(curr.right != null) queue.offer(curr.right);
            }
            list.add(temp);
            left2Right = !left2Right;
        }
        return list;
    }
}