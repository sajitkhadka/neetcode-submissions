/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (i1, i2)-> i1.start - i2.start);
        int minRooms  = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        for(Interval i: intervals){
            if(pq.isEmpty()){
                pq.offer(i.end);
            }else{
                if(pq.peek() <= i.start){
                    pq.poll();
                }
                 pq.offer(i.end);
            }
            minRooms = Math.max(minRooms, pq.size());
        }
        return minRooms;
    }
}
