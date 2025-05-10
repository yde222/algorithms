import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
            
        int currentSum = 0;
        for (int i = 0; i < k; i++)
            currentSum += arr[i];

        int maxSum = currentSum;

        // 슬라이딩 윈도우 시작
        for (int i = k; i < n; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }


         System.out.println(maxSum);
    }
}