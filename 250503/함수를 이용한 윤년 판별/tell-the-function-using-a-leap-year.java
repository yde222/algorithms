import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
       
        System.out.println(isYoon(y));
    }


    public static boolean isYoon(int n){
        if(n % 4 == 0 )
            return true;
        if(n % 100 == 0 && n % 400 != 0)
            return false;
        return false;
    }
}