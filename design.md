# Design
+ [Flatten Nested List Iterator](#flatten-nested-list-iterator)
+ [lru Cache](#lru-cache)
+ [Min Stack](#min-stack)
+ [Implement Stack Using Queues](#implement-stack-using-queues)
+ [Implement Queue Using Stacks](#implement-queue-using-stacks)
+ [Binary Search Tree Iterator](#binary-search-tree-iterator)

## Flatten Nested List Iterator
https://leetcode.com/problems/flatten-nested-list-iterator/

``java
List<NestedInteger> list;
Iterator<NestedInteger> it;
NestedIterator nestIt;
Integer next;
public NestedIterator(List<NestedInteger> nestedList) {
        list = nestedList;
        it = nestedList.iterator();
    }
    @Override
    public Integer next() {
        return next;
    }
    @Override
    public boolean hasNext() {
        if (nestIt==null) {
            if (!it.hasNext()) return false;
            NestedInteger ni= it.next();
            if (ni.isInteger()) {
			    next = ni.getInteger(); 
				return true;
		    }
            nestIt = new NestedIterator(ni.getList());
        }
		
        if (nestIt.hasNext()) {
		    next=nestIt.next(); 
		    return true;
		}
        nestIt = null;
        return this.hasNext();
}

## lru Cache
https://leetcode.com/problems/lru-cache/

## Min Stack
https://leetcode.com/problems/min-stack/

## Implement Stack Using Queues
https://leetcode.com/problems/implement-stack-using-queues/

## Implement Queue Using Stacks
https://leetcode.com/problems/implement-queue-using-stacks/

## Binary Search Tree Iterator
https://leetcode.com/problems/binary-search-tree-iterator/
