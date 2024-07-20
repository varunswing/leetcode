import java.util.Scanner;

public class MaxConsecutiveOnesInArray {

    public static int solution(String s){
        int n = s.length();
        int maxConsecutiveOnes = 0;
        int currentOnes = 0;
        int totalOnes = 0;
        int maxWithOneFlip = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1'){
                currentOnes++;
                totalOnes++;
            }else{
                maxWithOneFlip = Math.max(maxWithOneFlip, currentOnes);
                currentOnes = 0;
            }
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentOnes);
        }

        if(maxConsecutiveOnes == n){
            return n;
        }

        currentOnes = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1'){
                currentOnes++;
            }else{
                int leftOnes = currentOnes;
                int rightOnes = 0;
                for(int j=i+1; j<n && s.charAt(j) == '1'; j++){
                    rightOnes++;
                }
                maxWithOneFlip = Math.max(maxWithOneFlip, leftOnes+rightOnes+1);
                currentOnes = 0;
            }
        }

        return Math.min(totalOnes, Math.max(maxConsecutiveOnes, maxWithOneFlip));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
    
}
