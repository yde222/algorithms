import java.util.*;

public class Main {
    static int n, m;
    static String[] arr;
    static int count = 0;

    static String word = "LEE";
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        int len = word.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int d = 0; d < 8; d++) {
                    if (matches(i, j, dx[d], dy[d], len)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    static boolean matches(int x, int y, int dx, int dy, int len) {
        for (int k = 0; k < len; k++) {
            int nx = x + dx * k;
            int ny = y + dy * k;
            if (nx < 0 || ny < 0 || nx >= n || ny >= m) return false;
            if (arr[nx].charAt(ny) != word.charAt(k)) return false;
        }
        return true;
    }
}
