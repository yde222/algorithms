import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.print(count369(A, B));
    }
    

    public static boolean is369Num(int n){
        String stn = Integer.toString(n);
        boolean a=false;
        for(int i=0; i<stn.length();i++){
            if(stn.charAt(i) == '3' || stn.charAt(i) =='6' ||stn.charAt(i) =='9' ){
                a=true;
                break;
            } 
        }
       return a;
    }

   public static int count369(int a, int b){
        int count = 0;
        for (int i = a; i <= b; i++){
            if (i % 3 == 0 || is369Num(i))
                count++;
        }

        return count;
    }



   
    
}