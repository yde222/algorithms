import java.util.*;

class Student implements Comparable<Student> {
    String names;
    int korean, english, math;

    public Student(String names, int korean, int english, int math) {
        this.names = names;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {
        if (this.korean != student.korean)
            return student.korean - this.korean;
        if (this.english != student.english)
            return student.english - this.english;
        if (this.math != student.math)
            return student.math - this.math;
        return this.names.compareTo(student.names); // name: still case-sensitive
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);

        for (Student s : students) {
            System.out.println(s.names + " " + s.korean + " " + s.english + " " + s.math);
        }
    }
}
