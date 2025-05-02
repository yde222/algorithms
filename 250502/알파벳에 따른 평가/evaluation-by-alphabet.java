import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(str.equals("S")){
             System.out.println("Superior");
        }else if(str.equals("A")){
             System.out.println("Excellent");
        }else if(str.equals("B")){
             System.out.println("Good");
        }else if(str.equals("C")){
             System.out.println("Usually");
        }else if(str.equals("D")){
             System.out.println("Effort");
        }else{
             System.out.println("Failure");
        }
    }
}