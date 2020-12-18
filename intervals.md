# Intervals
+ [Non-overlapping Intervals](#non-overlapping-intervals)
+ [Merge-Intervals](#merge-intervals)
+ [Insert-Interval](#insert-interval)

## Non-overlapping Intervals
https://leetcode.com/problems/non-overlapping-intervals/

## Merge Intervals
https://leetcode.com/problems/merge-intervals/
``java
 private class IntervalComparator implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            return a[0] < b[0] ? -1: a[0] == b[0] ? 0 : 1;
        }
    }
    public int[][] merge(int[][] intervals) {
        if (intervals == null)
            return intervals;
        LinkedList<int[]> heap = new LinkedList<>();
        Collections.sort(Arrays.asList(intervals),new IntervalComparator());
        for (int[] interval : intervals) {
            if (heap.isEmpty() || heap.getLast()[1] < interval[0]) 
                heap.add(interval);
            else if (interval[1] >= heap.getLast()[1])
                heap.getLast()[1] = interval[1];
        }
        return heap.toArray(new int[heap.size()][]);
    }
``

## Insert Interval
https://leetcode.com/problems/insert-interval/
