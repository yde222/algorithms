import java.util.Scanner;
public class Main {

   
    static int print3n(int n){

        if(n==1)
            return count;

        if(n % 2 == 0){
           
            return print3n(n /= 2)+1;
        }else{
           
            return print3n(n = n*3+1)+1;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(print3n(n));
    }
}