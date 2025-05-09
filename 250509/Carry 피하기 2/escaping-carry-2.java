import java.util.*;
public class Main {

    public static boolean carryFree(int a, int b, int c){
        while(a >0 || b >0 || c >0){
            int sum = (a % 10) +( b % 10) + ( c % 10);
            if(sum >= 10) return false;
            a /= 10;
            b /= 10;
            c /= 10;
        }
        return true;

    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

         int maxSum = -1;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k =j+1; k< n; k++){
                    if(carryFree(arr[i],arr[j],arr[k])){
                       int sum = arr[i]+ arr[j]+arr[k];
                        maxSum = Math.max(maxSum,sum);
                    }
                }
            }
        }        
         System.out.println(maxSum);
    }
}