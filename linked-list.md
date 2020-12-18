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

``java
public boolean isPalindrome(ListNode head) {
		int len = 0;
		ListNode p = head, tmp, newHead = null;
		while (p != null) {
			p = p.next;
			++len;
		}
		p = head;
		int halfLen = len >>> 1;
		for (int i = 0; i < halfLen; ++i) {
			tmp = p.next;
			p.next = newHead;
			newHead = p;
			p = tmp;
		}
		if (len % 2 == 1) {
			p = p.next;
		}
		for (int i = 0; i < halfLen; ++i) {
			if (newHead.val != p.val)
				return false;
			newHead = newHead.next;
			p = p.next;
		}
		return true;
	}
``
## Merge-Two-Sorted-Lists
https://leetcode.com/problems/merge-two-sorted-lists/
## Intersection-Of-Two-Linked-Lists
https://leetcode.com/problems/intersection-of-two-linked-lists/
## Sort-List
https://leetcode.com/problems/sort-list/
## Reorder List
https://leetcode.com/problems/reorder-list/
