import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        
        char[] chars1 = word1.toCharArray();
        Arrays.sort(chars1);
        String sortedS1 = new String(chars1);

    
    
        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars2);
        String sortedS2 = new String(chars2);

        if(sortedS1.equals(sortedS2))
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}