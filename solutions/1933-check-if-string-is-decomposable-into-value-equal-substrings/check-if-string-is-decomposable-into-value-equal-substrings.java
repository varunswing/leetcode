class Solution {
    public boolean isDecomposable(String s) {
        int count = 1;
        List<Integer> v = new ArrayList<>();
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }else{
                v.add(count);
                count = 1;
            }
        }

        v.add(count);

        boolean flag = false;

        for(Integer a : v){
            if(a == 1 || a%3 == 1){
                return false;
            }
            if(!flag && (a == 2 || a%3 == 2)){
                flag = true;
                continue;
            }
            if(flag && (a == 2 || a%3 == 2)){
                return false;
            }
        }

        if(!flag){
            return false;
        }

        return true;
    }
}