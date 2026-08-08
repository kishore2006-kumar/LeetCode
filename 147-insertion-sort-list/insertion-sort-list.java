class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        List<Integer> list=new ArrayList<>();
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(list);
        temp = head;

        int ind = 0;
        while(temp != null) {
            temp.val = list.get(ind++);
            temp = temp.next;
        }
        return head;
    }
}