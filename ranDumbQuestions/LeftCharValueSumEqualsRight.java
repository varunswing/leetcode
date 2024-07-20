import java.util.Scanner;

public class LeftCharValueSumEqualsRight {

    public static int solution(String s) {
        if (s. length() % 2 != 0) {
            return -1;
        }

        int mid = s. length() / 2;
        int leftSum = 0;
        int rightSum = 0;
        
        for (int i = 0; i < mid; i++) {
            leftSum += s. charAt(i) - 'a' + 1;
        }

        for (int i = mid; i < s. length(); i++) {
            rightSum += s. charAt(i) - 'a' + 1;
        }

        if (leftSum == rightSum) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}