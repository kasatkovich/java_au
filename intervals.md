# Intervals
+ [Non-overlapping Intervals](#non-overlapping-intervals)
+ [Merge-Intervals](#merge-intervals)
+ [Insert-Interval](#insert-interval)

## Non-overlapping Intervals
https://leetcode.com/problems/non-overlapping-intervals/

## Merge Intervals
https://leetcode.com/problems/merge-intervals/

## Insert Interval
https://leetcode.com/problems/insert-interval/

``java
public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i = 0;
        int insert = 0;
        ArrayList<int[]> results = new ArrayList<int[]>();

        while (i<n){
            if (intervals[i][1]<newInterval[0]) {
                results.add(intervals[i]);
                insert +=1;
            }else if (intervals[i][0]>newInterval[1]){
                results.add(intervals[i]);
            }else{
                newInterval[0]=Math.min(intervals[i][0], newInterval[0]);
                newInterval[1]=Math.max(intervals[i][1], newInterval[1]);
            }
            i+=1;            
        }
        results.add(insert,newInterval);
        return results.toArray(new int[results.size()][2]);
    }
``
