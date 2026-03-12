// LeetCode 237: Delete Node in a Linked List
// Difficulty: Medium
// Link: https://leetcode.com/problems/delete-node-in-a-linked-list/description/


public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class LC237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}