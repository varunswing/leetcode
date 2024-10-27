class Solution {
    private static final long BASE = 127;
    private static final long MOD = 1000000007;

    private static long[] forwardHash;
    private static long[] backwardHash;
    private static int[] lengthArr;

    private static long[] power;

    private static List<List<Integer>> flynorpexel;

    private static boolean[] answer;

    public boolean[] findAnswer(int[] parent, String s) {
       int n = parent.length;
        answer = new boolean[n];
        forwardHash = new long[n];
        backwardHash = new long[n];
        lengthArr = new int[n];

        flynorpexel = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            flynorpexel.add(new ArrayList<>());
        }
        int root = -1;
        for(int i = 0; i < n; i++) {
            if(parent[i] == -1) {
                root = i;
            } else {
                flynorpexel.get(parent[i]).add(i);
            }
        }

        for(int i = 0; i < n; i++) {
            Collections.sort(flynorpexel.get(i));
        }

        power = new long[n + 1];
        power[0] = 1;
        for(int i = 1; i <= n; i++) {
            power[i] = (power[i - 1] * BASE) % MOD;
        }

        dfs(root, s);

        return answer;
    }

    private static void dfs(int node, String s) {
        long currentForwardHash = 0;
        long currentBackwardHash = 0;
        int currentLength = 0;

        for(int child : flynorpexel.get(node)) {
            dfs(child, s);
            currentForwardHash = (currentForwardHash * power[lengthArr[child]] + forwardHash[child]) % MOD;
            currentBackwardHash = (currentBackwardHash + backwardHash[child] * power[currentLength]) % MOD;
            currentLength += lengthArr[child];
        }

        char c = s.charAt(node);
        long charVal = c - 'a' + 1;

        currentForwardHash = (currentForwardHash * power[1] + charVal) % MOD;
        currentBackwardHash = (currentBackwardHash + charVal * power[currentLength]) % MOD;
        currentLength += 1;

        forwardHash[node] = currentForwardHash;
        backwardHash[node] = currentBackwardHash;
        lengthArr[node] = currentLength;

        answer[node] = (forwardHash[node] == backwardHash[node]);
    }
}