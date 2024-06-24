package generics.set_exercicio2.application;

import generics.set_exercicio2.entities.Course;
import generics.set_exercicio2.entities.Instructor;
import generics.set_exercicio2.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Instructor instructor = new Instructor("Nelio");

        System.out.println("How many students for course A? ");
        int studentsAmount = sc.nextInt();
        Course a = new Course("A", instructor);

        for (int i = 0; i < studentsAmount; i++) {
            a.addStudent(new Student(sc.next()));
        }

        System.out.println("How many students for course B? ");
        studentsAmount = sc.nextInt();
        Course b = new Course("B", instructor);

        for (int i = 0; i < studentsAmount; i++) {
            b.addStudent(new Student(sc.next()));
        }

        System.out.println("How many students for course C? ");
        studentsAmount = sc.nextInt();
        Course c = new Course("C", instructor);

        for (int i = 0; i < studentsAmount; i++) {
            c.addStudent(new Student(sc.next()));
        }



        Set<Student> studentsOfIntructor = new HashSet<>();
        studentsOfIntructor.addAll(a.getStudents());
        studentsOfIntructor.addAll(b.getStudents());
        studentsOfIntructor.addAll(c.getStudents());

        System.out.println("Total of students: " + studentsOfIntructor.size());
    }
}
