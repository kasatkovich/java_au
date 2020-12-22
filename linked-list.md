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

``java
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2!=null&&l1.val>l2.val){
          ListNode head = new ListNode(l2.val);
          ListNode temp = l1;
          l1 = head;
          l1.next = temp;
          l2=l2.next;
        }
        while(l2!=null){
            insert(l2.val,l1);
            l2=l2.next;
        }
        
     return l1;
    }
    public void insert(int data, ListNode l1){
         ListNode head = new ListNode(data);
        while(l1.next!=null){
            if(l1.next.val>data){
                break;
            }
            l1 = l1.next;
        }
        ListNode temp = l1.next;
        l1.next = head;
        head.next = temp;
        } 
``
## Intersection-Of-Two-Linked-Lists
https://leetcode.com/problems/intersection-of-two-linked-lists/
## Sort-List
https://leetcode.com/problems/sort-list/
## Reorder List
https://leetcode.com/problems/reorder-list/
