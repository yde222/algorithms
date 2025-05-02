import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int lcm = findLcm(n, m);
        System.out.println(lcm);
    }

    public static int findGcd(int a, int b) {
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLcm(int a, int b) {
        int gcd = findGcd(a, b);
        return a * b / gcd;
    }
}
