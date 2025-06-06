import java.util.Scanner;
public class Main {
    public static final int MAX_DIGIT =20;
    public static int[] digits = new int[MAX_DIGIT];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cnt = 0;
        
        while(true){
            if(n<2){
                digits[cnt++]=n;
                break;
            }

            digits[cnt++]= n%2;
            n/=2;

        }

        for(int i=cnt-1;i>=0;i--){
            System.out.print(digits[i]);
        }

    }
}