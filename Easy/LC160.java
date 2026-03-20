// LeetCode 160: Intersection of Two Linked Lists
// Difficulty: Easy
// Link: https://leetcode.com/problems/intersection-of-two-linked-lists/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LC160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int sizeA = 0;
        int sizeB = 0;
        while(tempA != null) {
            sizeA += 1;
            tempA = tempA.next;
        }
        while(tempB != null) {
            sizeB += 1;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;
        if(sizeA >= sizeB) {
            for(int i = 1; i <= sizeA-sizeB; i++) {
                tempA = tempA.next;
            }
        } else {
            for(int i = 1; i <= sizeB-sizeA; i++) {
                tempB = tempB.next;
            }
        }

        while(tempA != tempB && tempA != null && tempB != null) {
            tempA = tempA.next;   
            tempB = tempB.next;
        }

        return (tempA == tempB) ? tempA : null;
    }
}