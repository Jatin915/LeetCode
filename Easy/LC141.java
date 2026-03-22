// LeetCode 141: Linked List Cycle
// Difficulty: Easy
// Link: https://leetcode.com/problems/linked-list-cycle/description/

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
public class LC141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head != null && head.next != null) {
            do {
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow) {
                    return true;
                }
            } while(slow != null && fast != null && fast.next != null);
        }
        return false;
    }
}