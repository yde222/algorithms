import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        int num =0;
        for(int i=0; i<binary.length();i++){
            int bit = binary.charAt(binary.length()-1-i)-'0';
            num += bit * Math.pow(2,i);
        }
        System.out.println(num);
    }
}

