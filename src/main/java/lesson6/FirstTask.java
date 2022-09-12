package lesson6;

import java.util.List;
import java.util.stream.Collectors;

public class FirstTask {

  public static List<Student> filterStudents(List<Student> students) {
    return students.stream()
        .filter(student -> student.getMarks().values().stream().allMatch(mark -> mark >= 3))
        .collect(Collectors.toList());
  }

  public static void findStudentWithSelectedCourse(List<Student> students, int course) {
    students.forEach(student -> {
          if (student.getCourse() == course) {
            System.out.println(student.getName());
          }
        }
    );
  }
}
