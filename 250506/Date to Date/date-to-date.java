import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int elapsedDays = 1;


        int[] numofday = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while(true){
            if(m1==m2&&d1==d2)
                break;

            elapsedDays++;
            d1++;

            if(d1 > numofday[m1]){
                m1++;
                d1=1;
            }
        }
        System.out.print(elapsedDays);

        
    }
}