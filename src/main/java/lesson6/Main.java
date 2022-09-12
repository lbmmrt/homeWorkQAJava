package lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    students.add(new Student(2, "Ivan", "A", Map.of("Math", 3, "Fisics", 2, "Rus", 5)));
    students.add(new Student(2, "Petr", "A", Map.of("Math", 2, "Fisics", 2, "Rus", 5)));
    students.add(new Student(1, "Masha", "A", Map.of("Math", 3, "Fisics", 4, "Rus", 4)));

    System.out.println(FirstTask.filterStudents(students));

    FirstTask.findStudentWithSelectedCourse(students, 2);
  }
}
