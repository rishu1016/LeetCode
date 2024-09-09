class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p1.next != null && p2.next != null){
            int temp = p1.val;
            p1.val = p2.val;
            p2.val = temp;
            p1 = p2.next;
            if(p1.next!=null){
                p2 = p1.next;

            }else{
                return head;
            }

        }
        int temp = p1.val;
        p1.val = p2.val;
        p2.val = temp;
        return head;
    }
}