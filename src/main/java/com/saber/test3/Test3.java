package com.saber.test3;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("saber",37));
        students.add(new Student("bruce",33));
        students.add(new Student("ali",29));
        students.add(new Student("javad",27));
        students.add(new Student("jackie",70));
        NavigableSet<Student> descendingStudents = students.descendingSet();

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("=====================================================");
        for (Student student : descendingStudents) {
            System.out.println(student);
        }
      
    }
}
