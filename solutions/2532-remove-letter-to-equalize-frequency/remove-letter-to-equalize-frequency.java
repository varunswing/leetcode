class Solution {
    public boolean equalFrequency(String word) {
        int[] cnt = new int[26];

        for(char c : word.toCharArray()){
            cnt[c - 'a']++;
        }

        for(char c : word.toCharArray()){
            --cnt[c-'a'];
            if(freq(cnt)){
                return true;
            }
            cnt[c-'a']++;
        }

        return false;
    }

    public boolean freq(int[] cnt){
        int min = 101;
        int mf = 0;

        for(int f : cnt){
            if(f > 0){
                min = Math.min(min, f);
                mf = Math.max(mf, f);
            }
        }
        return min == mf;
    }
}