import java.util.*;
import java.io.*;


public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if(cmd.equals("push_back")){
                int x = Integer.parseInt(st.nextToken());
                arr.add(x);
            }
            else if(cmd.equals("pop_back")){
                if(!arr.isEmpty()){
                    arr.remove(arr.size()-1);
                }
            }
             else if (cmd.equals("get")) {
                int idx = Integer.parseInt(st.nextToken());
                System.out.println(arr.get(idx - 1)); // 1-based 인덱스를 0-based로 변환
            } 
            else if(cmd.equals("size")){
                System.out.println(arr.size());
            }
        }
    }
}