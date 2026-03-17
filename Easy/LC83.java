// LeetCode 83: Remove Duplicates from Sorted List
// Difficulty: Easy
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class LC83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null) {
            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }
}