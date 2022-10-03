package lesson7;

import lesson6.Student;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Map;

public class StudentBuilder {

  private int course;
  private String name;
  private String group;
  private Map<String, Integer> marks;

  public void marks(@NonNull Map<String, Integer> marks) {
    this.marks = marks;
  }

  public void course(int course) {
    this.course = course;
  }

  public void name(String name) {
    this.name = name;
  }

  public void group(@NonNull String group) {
    this.group = group;
  }

  public Student build() {
    return new Student(course, name, group, marks);
  }
}
