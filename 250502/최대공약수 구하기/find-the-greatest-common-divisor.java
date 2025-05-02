import java.util.Scanner;

public class Main {

  public static int gcd(int[] arr) {
    int result = arr[0];
    for (int i = 1; i < arr.length; i++) {
        result = gcd(result, arr[i]);
    }
    return result;
}

public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
       
        System.out.println(gcd(n,m));

    }
}