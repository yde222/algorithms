import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        findLcm(n,m);
    }

    public static void findLcm(int a, int b) {
        int gcd = 0;
        for(int i = 1; i <= Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.println(a * b / gcd);
    }
}
