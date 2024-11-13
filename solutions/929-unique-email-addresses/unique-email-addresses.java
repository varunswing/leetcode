class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> ans = new HashSet<>();
        for(String s : emails){
            StringBuilder sb = new StringBuilder();
            boolean flag = true;
            boolean isDomain = false;
            for(int i=0; i<s.length(); i++){
                if(!isDomain){
                    if(s.charAt(i) == '.' && !isDomain){
                        continue;
                    }else if(s.charAt(i) == '+'){
                        flag = false;
                    }else if(!flag && s.charAt(i) == '@'){
                        flag = true;
                        isDomain = true;
                        sb.append(s.charAt(i));
                    }else if(s.charAt(i) == '@'){
                        isDomain = true;
                        sb.append(s.charAt(i));
                    }else if(flag){
                        sb.append(s.charAt(i));
                    }
                }else{
                    sb.append(s.charAt(i));
                }
                
            }
            ans.add(sb.toString());
        }
        for(String s : ans){
            System.out.println(s);
        }
        return ans.size();
    }
}