import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        
        if(isSubsequence(a,b))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isSubsequence(int[] x, int[] y){
        for(int i=0; i<=x.length-y.length;i++ ){
            int j=0;
            while(j < y.length && x[i+j]==y[j] ){
                j++;
            }
            if(j==y.length) 
                return true;
        }
        return false;      
    }
}