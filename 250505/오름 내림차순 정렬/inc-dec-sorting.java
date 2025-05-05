import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
      

         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
          Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = n-1; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
         System.out.println();
        
    }
}