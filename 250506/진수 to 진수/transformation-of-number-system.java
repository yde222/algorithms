import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();

        int num = 0;
        for(int i=0; i< N.length(); i++){
            num = num*A +(N.charAt(i)-'0');
        }

        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num%B);
            num /= B;
        }

        System.out.println(sb.reverse().toString());
    }
}