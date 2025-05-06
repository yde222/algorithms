import java.util.Scanner;
import java.util.Arrays;

class Student{
    String name;
    int sco1,sco2,sco3;

    public Student(String name, int sco1, int sco2,int sco3){
        this.name = name;
        this.sco1 = sco1;
        this.sco2 = sco2;
        this.sco3 = sco3;
    }
}



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            students[i]= new Student(name,score1,score2,score3);
        }
        
    

        Arrays.sort(students, (a, b) -> {
            int totalA = a.sco1 + a.sco2 + a.sco3;
            int totalB = b.sco1 + b.sco2 + b.sco3;
            return totalA - totalB;
        });

        
        for (Student s : students){
            System.out.println(s.name+" "+s.sco1+" "+s.sco2+" "+s.sco3);
        }
    }
}