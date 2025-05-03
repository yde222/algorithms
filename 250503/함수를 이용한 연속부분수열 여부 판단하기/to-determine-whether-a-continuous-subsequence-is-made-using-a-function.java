import java.util.Scanner;

public class Main {

    // a 배열에서 start 위치부터 b 배열과 일치하는지 확인
    private static boolean matchesFrom(int[] a, int[] b, int start) {
        for (int i = 0; i < b.length; i++) {
            if (a[start + i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    // b가 a의 연속 부분 수열인지 확인
    private static boolean isSubsequence(int[] a, int[] b) {
        if (b.length > a.length) return false;

        for (int i = 0; i <= a.length - b.length; i++) {
            if (matchesFrom(a, b, i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(isSubsequence(a, b) ? "Yes" : "No");
    }
}
