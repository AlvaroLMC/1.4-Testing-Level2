package Exercises1to7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Java", 2023);
        Course course2 = new Course("PHP", 2024);
        Course course3 = new Course("Python", 2023);

        List<Course> courses = new ArrayList<Course>();

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        for (Course c : courses) {
            System.out.println(c);
        }
    }
}
