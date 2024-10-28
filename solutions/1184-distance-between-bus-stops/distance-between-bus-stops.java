class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dis1 = 0;
        int dis2 = 0;

        if(start == destination){
            return 0;
        }else if(destination > start){
            for(int i = start; i<destination; i++){
                dis1 += distance[i];
            }
            for(int i=0; i<start; i++){
                dis2 += distance[i];
            }
            for(int i=destination; i<distance.length; i++){
                dis2 += distance[i];
            }

        }else{
            int temp = start;
            start = destination;
            destination = temp;
            for(int i = start; i<destination; i++){
                dis1 += distance[i];
            }
            for(int i=0; i<start; i++){
                dis2 += distance[i];
            }
            for(int i=destination; i<distance.length; i++){
                dis2 += distance[i];
            }
        }
        

        
        return Math.min(dis1, dis2);
    }
}