// LeetCode 142: Linked List Cycle II
// Difficulty: Medium
// Link: https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LC142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head != null && head.next != null) {
            do {
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow) {
                    slow = head;
                    while(slow != fast) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow;
                }
            }
            while(slow != null && fast != null && fast.next != null);
        }
        return null;
    }
}