class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Comparator<Interval> start = (a, b) -> (a.start - b.start);

        Collections.sort(intervals, start);

        for(int i=1; i<intervals.size(); i++){
            Interval i1 = intervals.get(i-1);
            Interval i2 = intervals.get(i);

            if(i1.end > i2.start){
                return false;
            }
        }
        return true;

    }
}