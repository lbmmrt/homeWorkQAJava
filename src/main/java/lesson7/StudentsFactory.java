package lesson7;

import lesson6.Student;

import java.util.Map;

public class StudentsFactory {

  public Student getStudent(DegreeType type) {
    switch (type) {
      case BACHELOR -> {
        return new Bachelor(1, "Ivan", "A", Map.of());
      }
      case MASTER -> {
        return new Master(1, "Ivan", "A", Map.of());
      }
    }

    throw new IllegalStateException();
  }
}
