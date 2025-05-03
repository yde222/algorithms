import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (isPalindrome(input)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

    }


    public static boolean isPalindrome(String str){
        int len = str.length();
        for(int i = 0;i<len/2;i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
    
}