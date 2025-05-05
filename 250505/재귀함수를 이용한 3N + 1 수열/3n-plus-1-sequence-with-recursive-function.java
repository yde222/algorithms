import java.util.Scanner;
public class Main {

    public static int count=0;
    static int print3n(int n){

        if(n==1)
            return count;

        if(n % 2 == 0){
            count++;
            return print3n(n /= 2);
        }else{
            count++;
            return print3n(n = n*3+1);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(print3n(n));
    }
}