class Solution {

    class Bob{
        int d;
        int h;
        double r;
    

        Bob(double r, int d, int h){
            this.r = r;
            this.d = d;
            this.h = h;
        }
    }


    public long minDamage(int power, int[] damage, int[] health) {
        PriorityQueue<Bob> pq = new PriorityQueue<>((a, b)->Double.compare(b.r, a.r));

        long td = 0, res = 0;

        for(int i=0; i<damage.length; i++){
            td+=damage[i];

            double timeToKill = Math.ceil(1.0*health[i]/power);

            double ratio = damage[i]/timeToKill;

            pq.add(new Bob(ratio, damage[i], health[i]));
        }

        while(!pq.isEmpty()){
            Bob ele = pq.poll();

            int timeToKill = (int) Math.ceil(1.0*ele.h/power);

            res += timeToKill*td;

            td -= ele.d;
        }

        return res;
    
    }
}