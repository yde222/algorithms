import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st =  new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i ; j < n; j++) {
                int sum = 0;
                HashSet<Double> set = new HashSet<>();
                for(int k = i; k<= j; k++) {
                    sum += arr[k];
                    set.add((double) arr[k]);
                }
                double avg = (double)sum / (j-i+1);
                if(set.contains(avg)) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
