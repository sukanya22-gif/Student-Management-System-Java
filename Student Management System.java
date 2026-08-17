import java.io.*;
import java.util.*;

class Student {
    int id;
    String name;
    int marks;
    
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    public String toString() {
        return id + "," + name + "," + marks;
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(true) {
            System.out.println("\n1.Add 2.Display 3.Search 4.Exit");
            int choice = sc.nextInt();
            if(choice==1) addStudent();
            else if(choice==2) display();
            else if(choice==3) search();
            else break;
        }
    }
    
    static void addStudent() {
        System.out.print("ID: "); int id = sc.nextInt();
        System.out.print("Name: "); String name = sc.next();
        System.out.print("Marks: "); int marks = sc.nextInt();
        students.add(new Student(id,name,marks));
        System.out.println("Student Added!");
    }
    
    static void display() {
        for(Student s: students) 
            System.out.println(s.id + " " + s.name + " " + s.marks);
    }
    
    static void search() {
        System.out.print("Enter ID: "); int id = sc.nextInt();
        for(Student s: students) 
            if(s.id==id) System.out.println(s.id + " " + s.name);
    }
}
