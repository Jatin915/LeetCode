// LeetCode 234: Palindrome Linked List
// Difficulty: Easy
// Link: https://leetcode.com/problems/palindrome-linked-list/description/

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
class LC234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        //find middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse the halve list
        ListNode prev = null;
        while(slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        //check palindrome
        fast = head;
        while(prev != null ) {
            if(fast.val != prev.val) return false;
            fast = fast.next;
            prev = prev.next;
        }
        return true;
    }
}