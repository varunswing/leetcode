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
    public int meeting-rooms-ii(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        int n = intervals.size();
        int[] s = new int[n];
        int[] e = new int[n];

        for(int i=0; i<n; i++){
            s[i] = intervals.get(i).start;
            e[i] = intervals.get(i).end;
        }

        Arrays.sort(s);
        Arrays.sort(e);

        for(int i=0; i<n; i++){
            System.out.println(s[i]);
        }

        for(int i=0; i<n; i++){
            System.out.println( " " + e[i]);
        }
        if(n == 0){
            return 0;
        }

        int ans = 1;
        int temp = 0;

        int i=0;
        int j=0;

        while(i < n && j < n){
            if(s[i] < e[j]){
                i++;
                temp++;
            }else{
                j++;
                temp--;
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}
