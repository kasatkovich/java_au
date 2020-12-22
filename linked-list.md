# Linked List
+ [Reverse-Linked-List](#reverse-linked-list)
+ [Middle-Of-The-Linked-List](#rmiddle-of-the-linked-list)
+ [Palindrome-Linked-List](#palindrome-linked-list)
+ [Merge-Two-Sorted-Lists](#merge-two-sorted-lists)
+ [Intersection-Of-Two-Linked-Lists](#intersection-of-two-linked-lists)
+ [Sort-List](#Sort-List)
+ [Reorder-List](#Reorder-List)

## Reverse-Linked-List
https://leetcode.com/problems/reverse-linked-list/
## Middle-Of-The-Linked-List
https://leetcode.com/problems/middle-of-the-linked-list/
## Palindrome-Linked-List
https://leetcode.com/problems/palindrome-linked-list/
## Merge-Two-Sorted-Lists
https://leetcode.com/problems/merge-two-sorted-lists/
## Intersection-Of-Two-Linked-Lists
https://leetcode.com/problems/intersection-of-two-linked-lists/
## Sort-List
https://leetcode.com/problems/sort-list/
## Reorder List
https://leetcode.com/problems/reorder-list/

``java
public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode middleNode = findMiddle(head);
        ListNode head1 = head;
        ListNode head2 = middleNode.next;
        middleNode.next = null;
        head2 = reverse(head2);
        ListNode nodePtr1 = head1;
        ListNode nodePtr2 = head2;
        
        while(nodePtr1 != null && nodePtr2 != null) {
            ListNode temp1 = nodePtr1.next;
            nodePtr1.next = nodePtr2;
            ListNode temp2 = nodePtr2.next;
            nodePtr2.next = temp1;
            nodePtr1 = nodePtr1.next.next;
            nodePtr2 = temp2;
        }
}
private ListNode reverse(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode forward;
        while (current != null) {
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        return previous;
    }
    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
}
``
