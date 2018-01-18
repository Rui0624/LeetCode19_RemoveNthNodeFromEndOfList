
 // Definition for singly-linked list.
 public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        ListNode cur = head;
        
        for(int i = 0; i < n; i++)
        	cur = cur.next;
        
        if(cur == null)
        	return head.next;
        
        while(cur.next != null){
        	pre = pre.next;
        	cur = cur.next;
        }
        pre.next = pre.next.next;
        
        return head;
    }
}
