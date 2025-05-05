import java.util.Scanner;
public class Main {
    public static int count =0;
    
    
    static int printNum(int n){
        
        if(n==1){
            return count;
        }

        if(n%2==0){
            count++;
            return printNum(n /= 2);
        }else{
            count++;
            return printNum(n /= 3);
        }
        
    }

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printNum(n);
        System.out.println(count);

    }
}