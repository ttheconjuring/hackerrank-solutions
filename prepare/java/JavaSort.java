package prepare.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JavaSort {

    static class Student {
        private int id;
        private String firstName;
        private double cgpa;

        public Student(int id, String firstName, double cgpa) {
            this.id = id;
            this.firstName = firstName;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public double getCGPA() {
            return cgpa;
        }

        @Override
        public String toString() {
            return String.format("%s", firstName);
        }

    }

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            List<Student> students = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                String[] studentInfoArray = br.readLine().split(" ");
                int id = Integer.parseInt(studentInfoArray[0]);
                String name = studentInfoArray[1];
                double gpa = Double.parseDouble(studentInfoArray[2]);
                students.add(new Student(id, name, gpa));
            }

            students.sort(Comparator.comparing(Student::getCGPA).reversed()
                    .thenComparing(Student::getFirstName)
                    .thenComparing(Student::getId));

            students.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

