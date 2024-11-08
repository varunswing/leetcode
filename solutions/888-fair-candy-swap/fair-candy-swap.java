class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int ta = 0, tb = 0, total = 0;

        Set<Integer> sa = new TreeSet<>();
        Set<Integer> sb =  new TreeSet<>();

        for(int i=0; i<aliceSizes.length; i++){
            ta += aliceSizes[i];
            sa.add(aliceSizes[i]);
        }
        for(int i=0; i<bobSizes.length; i++){
            tb += bobSizes[i];
            sb.add(bobSizes[i]);
        }
        int[] ans = new int[2];
        total = (ta+tb)/2;

        int i = 0, j=0;
        while(aliceSizes.length > j || bobSizes.length > i){
            if(ta > tb){
                if(sa.contains(total - tb + bobSizes[i])){
                    return new int[]{total - tb + bobSizes[i], bobSizes[i]};
                }
                i++;
            }else{
                if(sb.contains(total - ta + aliceSizes[j])){
                    return new int[]{aliceSizes[j], total - ta + aliceSizes[j++]};
                }
                j++;
            }
        }


        return ans;
    }
}