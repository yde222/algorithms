import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        int result;
    
        switch(o)  {
            case '+':
            result = plus(a, c);
            break;
            case '-':
           result = minus(a, c);
            break;
            case '*':
            result = multiple(a, c);
            break;
            case '/':
            result = divide(a, c);
            break;
            default:
            System.out.println("False");
            return;
        }
       System.out.println(a + " " + o + " " + c + " = " + result);
        
    }


    public static int plus(int x, int y){
        return x + y;
    }

    public static int minus(int x, int y){
        return x - y; 
    }


    public static int multiple(int x, int y){
        return x * y;
    }

    public static int divide(int x, int y){
        if (y == 0) {
            System.out.println("False");
            return 0;
        }
        return (int)x/y;
    }


}