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

``java
public ListNode sortList(ListNode head) {
        Queue<ListNode> queue = new LinkedList<>();
        ListNode node = head;
        while(node!=null){
            queue.offer(node);
            ListNode tmp = node.next;
            node.next = null;
            node = tmp;
        }
        while(queue.size()>1){
            queue.offer(merge(queue.poll(),queue.poll()));
        }
        return queue.peek();
    }
    
    private ListNode merge(ListNode node1,ListNode node2){
        ListNode head = null;
        
        if(node1.val > node2.val){
            head = node2;
            node2 = node2.next;
        }else{
            head = node1;
            node1 = node1.next;
        }
        
        ListNode node = head;
        
        while(node1!=null || node2!=null){
            if(node1==null || 
               (node2!=null && node1.val > node2.val)){
                node.next = node2;
                node2 = node2.next;
            }else{
                node.next = node1;
                node1 = node1.next;
            }
            node = node.next;
        }
        
        return head;
    }
``
## Reorder List
https://leetcode.com/problems/reorder-list/
