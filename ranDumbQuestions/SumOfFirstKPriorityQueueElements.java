import java.util.PriorityQueue;
import java.util.Scanner;

public class SumOfFirstKPriorityQueueElements {

    public static void sumOfFirstKElements(int n, int nums, int[] x, int[] y) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{y[i], x[i]});
        }

        int sum = 0;
        while (nums > 0 && !pq.isEmpty()) {
            int[] pair = pq.poll();
            sum += pair[1]; 
            nums--;
        }
        
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i=0; i<n; i++){
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        int nums = scanner.nextInt();
        sumOfFirstKElements(n, nums, x, y);
    }
}
