import java.util.Scanner;
public class Main {
    public static String[] weeks = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"}; 
    public static int getTotalDays(int m,int d){

        int[] daysInMonth = new int[]{
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        int totalDays = 0;

        for(int i= 1; i<m; i++){
            totalDays+= daysInMonth[i];
        }

        totalDays += d-1;

       return totalDays;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
       
        int day1 = getTotalDays(m1,d1);
        int day2 = getTotalDays(m2,d2);

        int baseWeekIndex = 1; 

        int diff = ((day2 - day1 + baseWeekIndex) % 7 + 7) % 7;

      
        System.out.println(weeks[diff]);

    }



}