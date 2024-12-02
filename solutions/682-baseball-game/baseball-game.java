class Solution {
    public int calPoints(String[] operations) {
        List<Integer> ans = new ArrayList<>();

        for(String s : operations){
            if(Character.isDigit(s.charAt(0)) || s.matches("-?\\d+")){
                ans.add(Integer.valueOf(s));
            }else if(s.charAt(0) == '+'){
                ans.add(ans.get(ans.size() - 1) + ans.get(ans.size() - 2));
            }else if(s.charAt(0) == 'D'){
                ans.add(ans.get(ans.size() - 1)*2);
            }else if(s.charAt(0) == 'C'){
                ans.removeLast();
            }
        }

        ans.forEach(num -> System.out.println(num));

        // return ans.stream().reduce(0, Integer::sum);

        return ans.stream().mapToInt(Integer::intValue).sum();
    }
}