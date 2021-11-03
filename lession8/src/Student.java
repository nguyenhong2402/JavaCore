import java.util.Scanner;

public class Student {
    int id;
    String name;
    float theoreticalpoint;
    float practicepoints;
    Scanner sc = new Scanner(System.in);
    public Student(){

    }
    public Student(int id, String name, float theoreticalpoint, float practicepoints) {
        this.id = id;
        this.name = name;
        this.theoreticalpoint = theoreticalpoint;
        this.practicepoints = practicepoints;
    }
    public Student[] liststudent() {

        System.out.println("Nhập số học sinh: ");
        int n = Integer.valueOf(sc.nextLine());
        Student[] list = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học viên thứ " + (i + 1));
            list[i] = input();
        }

        return list;
    }
    public Student input(){

        System.out.println("Nhập id học sinh: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        theoreticalpoint = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        practicepoints = sc.nextFloat();
        Student student = new Student(id,name,theoreticalpoint,practicepoints);
        return student;
    }
    public float mediumScore(){
        return (theoreticalpoint+practicepoints)/2;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + theoreticalpoint + " - " + practicepoints +" - " + mediumScore();
    }
}